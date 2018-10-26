package com.type.wide.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListMaker<T> {
	List<T>create(T t,int n){
		List<T>result =  new ArrayList<T>();
		for(int i=0;i<n;i++) {
			result.add(t);
		}
		return result;
		}
	
	public static void main(String[] args) {
		ListMaker<String>stringMaker = new ListMaker<String>();
		List<String> stringlist = stringMaker.create("hello!",8);
		System.out.println(stringlist);
	}
}
