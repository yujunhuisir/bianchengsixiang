package com.type.wide.interfaces;

public class Manipulation {
	public static void main(String[] args) {
	//	HasF hasF =new HasF();
		HasFRe hasF = new HasFRe();
		Manipulator<HasF> manipulator = new Manipulator<HasF>(hasF);
		manipulator.manipulator();
	}
}
