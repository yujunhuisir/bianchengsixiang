package com.type.wide.tongpeifu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CovariantArrays {
	public static void main(String[] args) {
		Fruit[] fruit = new Apple[10];
		fruit[0]=new Apple();
		fruit[1]=new Jonathan();
		
		try {
			fruit[0]=new Fruit();
		} catch (Exception e) {
		System.out.println(e);
		}
		try {
			fruit[0]=new Orange();
		}catch(Exception e) {
			System.out.println(e);
		}
		
//	//	List<Fruit>list=new ArrayList<Apple>();
//		List<?extends Fruit>flist=new ArrayList<Apple>();
//		flist.add(new Apple());
//		flist.add(new Fruit());
//		flist.add(null);
//		flist.add(new Object());
//		Fruit fruits = flist.get(0);
//		flist.add(new Apple());
		
		
		
		List<?extends Fruit>flist=Arrays.asList(new Apple());
		Apple a = (Apple) flist.get(0);
		System.out.println(flist.contains(new Apple()));
		System.out.println(flist.contains(new Object()));
		flist.indexOf(new Apple());
	}
}
