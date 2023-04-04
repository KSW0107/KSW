package com.yedam.inter2;

public class InterExample {

	public static void main(String[] args) {
		InterfaceC ic = new ImplementsC();
		
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		InterfaceA ac = new ImplementsC();
		ac.methodA();
		
		InterfaceB ab = new ImplementsC();
		ab.methodB();
	}

}
