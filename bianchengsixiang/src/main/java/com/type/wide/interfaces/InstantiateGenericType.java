package com.type.wide.interfaces;

public class InstantiateGenericType {
	/*
	 * 这是个问题？？？
	 */
	public static void main(String[] args) {
		ClassAsFactory<Building> fe = new ClassAsFactory<Building>(Building.class);
		System.out.println("successed");
		try {
		ClassAsFactory<Double>fi = new ClassAsFactory<Double>(Double.class);
		}catch(Exception e) {
			System.out.println("failed");
		}
		System.out.println("dddddddddd");
		
	}
}
