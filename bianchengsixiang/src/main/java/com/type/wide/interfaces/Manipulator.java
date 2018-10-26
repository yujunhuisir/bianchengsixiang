package com.type.wide.interfaces;

public class Manipulator<T extends HasF> {
	private T obj;
	public Manipulator(T x) {
		obj =x;
	}
	public void manipulator() {
		obj.f();
	}
}
