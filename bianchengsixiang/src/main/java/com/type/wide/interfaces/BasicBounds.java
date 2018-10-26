package com.type.wide.interfaces;

public class BasicBounds {
	public static void main(String[] args) {
		Solid<Bounded>soild = new Solid<Bounded>(new Bounded());
		soild.color();
		soild.getX();
		soild.weight();
	}
}
