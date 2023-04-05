package com.yedam.Set;

public class Member {
	//필드
	String name;
	int age;
	
	public Member(String name, int age) {
		this.age = age;
		this.name =name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(member.name.equals(name) && member.age==age) {
				return true;
			}
		}
		return false;
	}
	
	

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	
	
	
}
