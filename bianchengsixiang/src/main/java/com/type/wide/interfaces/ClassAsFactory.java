package com.type.wide.interfaces;

public class ClassAsFactory<T> {
	T x;
	public ClassAsFactory(Class<T>kind) {
		try {
			x=kind.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
