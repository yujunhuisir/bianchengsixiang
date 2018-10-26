package com.type.wide;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
	private ArrayList<T>storage = new ArrayList<T>();
	private Random random = new Random(47);
	public void add(T item) {storage.add(item);}
	public T select() {
		return storage.get(random.nextInt(storage.size()));
	}
	
	
	public static void main(String[] args) {
		RandomList<String>rs = new RandomList<String>();
		for(String s: "the quick brown the lazy brow dog".split(" "))
			rs.add(s);
		for(int i=0;i<8;i++) {
			System.out.println(rs.select()+" ");
		}
	}
}
