package com.yedam.member;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class MemberDAO extends DAO {
	// 싱글톤
	private static MemberDAO memberDao = null;

	private MemberDAO() {

	}

	public static MemberDAO getInstance() {
		if (memberDao == null) {
			memberDao = new MemberDAO();
		}
		return memberDao;
	}

	// 1.로그인
	public Member login(String id) {
		// 1. id가 틀렸다, pw가 틀렸다 <- 채택
		// 2. 존재하지 않거나 id&pw가 틀렸다

		// 기능
		// 1. login
		// 2. 회원가입 시 id 중복체크
		Member member = null;
		try {
			conn();
			String sql = "SELECT * FROM member WHERE id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();
			// 정상적으로 id 조회
			if (rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return member;
	}

	// 1. 회원조회
	public List<Member> getMembetList() {
		List<Member> list = new ArrayList<>();
		Member member = null;
		try {
			conn();
			String sql = "SELECT * FROM member";

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				member = new Member();

				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getNString("name"));

				list.add(member);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}

	// 2. 회원등록
	public int memberAdd(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO member values (?,?,?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}

		return result;
	}

	// 3. 회원수정
	public int memberUpdate(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE member SET pw =? WHERE id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(2, member.getId());
			pstmt.setString(1, member.getPw());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	// 4. 회원삭제
	public int memberDelete(String id) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM member WHERE id = ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return result;
	}
}
