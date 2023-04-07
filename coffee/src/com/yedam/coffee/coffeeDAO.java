package com.yedam.coffee;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class coffeeDAO extends DAO {
	private static coffeeDAO coffeeDao = null;

	private coffeeDAO() {
	}

	public static coffeeDAO getInstance() {
		if (coffeeDao == null) {
			coffeeDao = new coffeeDAO();
		}
		return coffeeDao;
	}

	// 메뉴 전체 조회
	public List<coffeeDTO> getAllCoffeeInfo() {
		List<coffeeDTO> list = new ArrayList<coffeeDTO>();
		coffeeDTO cofDto = null;

		try {
			conn();
			String sql = "SELECT coffee_menu, coffee_price FROM coffee";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				cofDto = new coffeeDTO();

				cofDto.setCofName(rs.getString("coffee_menu"));
				cofDto.setCofPrice(rs.getInt("coffee_price"));
				
				list.add(cofDto);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			disconn();
		}

		return list;
	}

	public coffeeDTO getCoffeeInfo(String cofName) {
		coffeeDTO cofDto = null;
		try {
			conn();
			String sql = "SELECT coffee_menu, coffee_price, coffee_explain, coffee_sales FROM coffee WHERE coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cofName);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				cofDto = new coffeeDTO();

				cofDto.setCofName(rs.getString("coffee_menu"));
				cofDto.setCofPrice(rs.getInt("coffee_price"));
				cofDto.setCofExpain(rs.getString("coffee_explain"));
				cofDto.setCofsales(rs.getInt("coffee_sales"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			disconn();
		}
		return cofDto;
	}

	public int coffeeAdd(coffeeDTO cofDto) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO coffee VALUES (?,?,?,0)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cofDto.getCofName());
			pstmt.setInt(2, cofDto.getCofPrice());
			pstmt.setString(3, cofDto.getCofExpain());
		

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	public int coffeeDelete(String coffeeName) {
		int result = 0;

		try {
			conn();
			String sql = "DELETE coffee WHERE coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeName);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	public int coffeeSale(coffeeDTO cofDto) {
		int result = 0;

		try {
			conn();
			String sql = "UPDATE coffee SET coffee_sales = coffee_sales+1 WHERE coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cofDto.getCofName());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	public List<coffeeDTO> getAllCoffeeSale() {
		List<coffeeDTO> list = new ArrayList<coffeeDTO>();
		coffeeDTO cofDto = null;

		try {
			conn();
			String sql = "SELECT coffee_menu, coffee_sales, (coffee_sales*coffee_price)as allsale FROM coffee";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				cofDto = new coffeeDTO();

				cofDto.setCofName(rs.getString("coffee_menu"));
				cofDto.setCofsales(rs.getInt("coffee_sales"));
				cofDto.setAllsales(rs.getInt("allsale"));

				list.add(cofDto);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}
	
}
