package com.type.wide.interfaces;

import java.awt.Color;

public class Colored2<T extends HasColor> extends HoldItem<T>{
	Colored2(T item){super(item);}
	Color color() {return item.getColor();}
}
