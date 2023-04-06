package com.yedam.member;

import java.util.List;
import java.util.Scanner;

public class MemberService {
	// 로그인 여부에 따라 나눔
	// 로그인 -> 메뉴를 이동할때마다 로그인 정보가 남아있어야함
	// 정적 멤버(static)
	// 1. login
	// login 성공
	// login -> id/pw -> 정보 조회 성공 -> 로그인
	// 로그인 -> 정적필드에게 로그인한 정보를 입력
	// login 실패
	// 정보 조회 실패 -> 정적 필드에 데이터 안 넣음

	public static Member memberInfo = null; // -> memberinfo 가 null이면 로그인X / null이 아니면 로그인O

	Scanner sc = new Scanner(System.in);

	public void login() {
		// id 입력
		System.out.println("ID >");
		String id = sc.nextLine();
		System.out.println("PW >");
		String pw = sc.nextLine();

		// 1. member = null id없음
		// 2. member != null 회원 정보있음
		Member member = MemberDAO.getInstance().login(id);

		if (member != null) {
			if (member.getPw().equals(pw)) {
				System.out.println("정상 로그인");
				System.out.println(member.getName() + "님 환영합니다");

				memberInfo = member;
			} else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		} else {
			System.out.println("아이디가 존재하지 않습니다");
		}
	}

	public void logout() {
		memberInfo = null;
		System.out.println("로그아웃 성공");
	}

	// 전체 조회
	public void getMemberList() {
		List<Member> list = MemberDAO.getInstance().getMembetList();

		for (Member member : list) {
			System.out.println("ID : " + member.getId());
			System.out.println("PW : " + member.getPw());
			System.out.println("NM : " + member.getName());
		}
	}

	// 회원 등록
	public void memberAdd() {
		String id = "";
		while (true) { // -> 프라이머리 역할 수행
			System.out.println("ID > ");
			id = sc.nextLine();
			Member member = MemberDAO.getInstance().login(id);
			if (member == null) {
				System.out.println("회원 가입 가능");
				break;
			} else {
				System.out.println("ID 중복");
			}
		}
		System.out.println("PW > ");
		String pw = sc.nextLine();
		System.out.println("이름 >");
		String name = sc.nextLine();

		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		member.setName(name);

		int result = MemberDAO.getInstance().memberAdd(member);

		if (result == 1) {
			System.out.println("회원 등록 성공");
		} else {
			System.out.println("회원 등록 실패");
		}
	}

	// 수정
	// login 되어 있는 정보를 수정? -> 실시간으로 로그인된 정보도 바꿔줘야함 ->채택
	// login 안되어 있는 정보를 수정?

	public void memberUpdate() {
		System.out.println("ID >");
		String id = sc.nextLine();
		System.out.println("PW >");
		String pw = sc.nextLine();

		Member member = new Member();
		member.setId(id);
		member.setPw(pw);

		int result = MemberDAO.getInstance().memberUpdate(member);

		if (result > 0) {
			if (id.equals(memberInfo.getId())) {
				memberInfo = MemberDAO.getInstance().login(id); // DB 데이터 갱신
			} else {
				System.out.println("PW 변경 실패");
			}
		}

	}

	public void memberDelete() {
		System.out.println("삭제 ID > ");
		String id = sc.nextLine();

		int result = MemberDAO.getInstance().memberDelete(id);

		
			if (result > 0) {
				if (id.equals(memberInfo.getId())) {
					memberInfo = null;
				} else {
					System.out.println("삭제 완료");
				}


		}
	}

}
