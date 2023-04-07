package com.yedam.account;

import com.yedam.common.DAO;
import com.yedam.customer.CustomerService;

public class AccountDAO extends DAO {
	private static AccountDAO accountDao = null;

	private AccountDAO() {

	}

	public static AccountDAO getInstance() {
		if (accountDao == null) {
			accountDao = new AccountDAO();
		}
		return accountDao;
	}

	// 계좌 개설 - insert
	public int accountAdd(Account account) {
		int result = 0;
		try {
			conn();
			// 시퀀스
			String sql = "INSERT INTO account VALUES (?,?,?,sysdate)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, account.getAccountId());
			pstmt.setInt(2, account.getCustomerId());
			pstmt.setInt(3, account.getBalance());
			// 날짜는 DB sysdate 사용가능

			result = pstmt.executeUpdate(); // 변경 횟수

//			//sql 하나 더
//			if(result == 1) {
//				String sql2 = "UPDATE customer SET account_id = ? WHERE customer_id = ?";
//				pstmt=conn.prepareStatement(sql2);
//				pstmt.setInt(1, account.getAccountId());
//				pstmt.setInt(2, account.getCustomerId());
//				
//				int result2 = pstmt.executeUpdate();
//				if(result == 1) {
//					System.out.println("고객 계좌 등록 완료");
//				}else {
//					System.out.println("고객 계좌 등록 실패");
//				}
//			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 계좌 해지 - update, delete
	// 계좌를 당장 삭제 X -> 3개월 뒤에 삭제 또는 해지한 히스토리 관리
	// update -> column 활성화/사용유무 -> Y,N,L(장시간 사용 X)

	public int accountDelete(int accountId) {
		int result = 0;
		try {
			conn();

			String sql = "DELETE FROM account WHERE account_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, accountId);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// JOIN
	public Account getAccount() {
		Account account = null;
		try {
			conn();

			String sql = "SELECT c.customer_id, c.customer_name, a.account_id, a.balance, a.credate\r\n"
					+ "FROM customer c JOIN account a \r\n" + "ON(c.customer_id = a.customer_id)\r\n"
					+ "WHERE c.customer_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, CustomerService.customerInfo.getCustomerId());

			rs = pstmt.executeQuery();

			if (rs.next()) {
				account = new Account();

				account.setCustomerId(rs.getInt("customer_id"));
				account.setCustomerName(rs.getString("customer_name"));
				account.setAccountId(rs.getInt("account_id"));
				account.setBalance(rs.getInt("balance"));
				account.setCredate(rs.getDate("credate"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			disconn();
		}
		return account;
	}

	// 입출금
	public int updateMoney(Account account, int cmd) {
		int result = 0;
		int balance = 0;
		try {
			conn();
			// 현재 잔고를 가져오는 쿼리문
			String sql = "SELECT balance FROM account WHERE account_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, account.getAccountId());

			rs = pstmt.executeQuery();
			if (rs.next()) {
				balance = rs.getInt("balance");
			}

			// 1.입금
			// 2.출금
			if (cmd == 1) {
				// balance 현재 잔고 + 입금 금액 = 통장 잔고
				// account.getBalance() + balance
//				account.setBalance(account.getBalance() + balance);
				String sql2 = "UPDATE account SET balance = balance + ? WHERE account_id = ?";
				pstmt = conn.prepareStatement(sql2);
				pstmt.setInt(1, account.getBalance());
				pstmt.setInt(2, account.getAccountId());

				result = pstmt.executeUpdate();
			} else if (cmd == 2) {
				// 잔고 >= 출금액
				if (balance - account.getBalance() >= 0) {
					String sql3 = "UPDATE account SET balance = balance - ? WHERE account_id = ?";
					pstmt = conn.prepareStatement(sql3);
					pstmt.setInt(1, account.getBalance());
					pstmt.setInt(2, account.getAccountId());

					result = pstmt.executeUpdate();
				} else {
					System.out.println("잔액이 부족합니다");
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			disconn();
		}

		return result;
	}

}
