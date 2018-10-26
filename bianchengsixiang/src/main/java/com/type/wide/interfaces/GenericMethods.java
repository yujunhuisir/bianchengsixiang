package com.type.wide.interfaces;

public class GenericMethods {
	public <T>void f(T x){
		System.out.println(x.getClass().getName());
	}
	
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.f(1);
		gm.f("");
		gm.f(gm);
		
	}
}
