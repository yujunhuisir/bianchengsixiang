package com.type.wide.interfaces;

import java.util.Iterator;
import java.util.Random;

import com.type.wide.coffee.Americano;
import com.type.wide.coffee.Breve;
import com.type.wide.coffee.Cappuccino;
import com.type.wide.coffee.Coffee;
import com.type.wide.coffee.Latte;
import com.type.wide.coffee.Mocha;

public class CoffeeGenerator implements Generator<Coffee> ,Iterable<Coffee>{
	
	private Class[]types= {Americano.class,Breve.class,Latte.class,Cappuccino.class,Mocha.class};
	private Random random = new Random(47);
	public CoffeeGenerator() {}
	private int size=0;
	public CoffeeGenerator(int size) {this.size =size;}
	public Coffee next() {
		
		try {
			return (Coffee) types[random.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}

	class CoffeeIterator implements Iterator<Coffee>{
		int count = size;
		public boolean hasNext() {	
			return count>0;
		}

		public Coffee next() {
			count--;
			return CoffeeGenerator.this.next();
		}
		
	}
	
	
	public Iterator<Coffee> iterator() {
		// TODO Auto-generated method stub
		return new CoffeeIterator();
	}

	
	
	public static void main(String[] args) {
//		CoffeeGenerator gen = new CoffeeGenerator();
//		for(int i=0;i<5;i++) {
//			System.out.println(gen.next());
//		}
		for(Coffee c:new CoffeeGenerator(5))
			System.out.println(c);
	}
}
