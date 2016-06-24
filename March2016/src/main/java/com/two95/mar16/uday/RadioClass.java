package com.two95.mar16.uday;

public class RadioClass {
	private String color;
	public RadioClass(){}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public RadioClass(String color) {
		super();
		this.color = color;
	}
	@Override
	public String toString() {
		return "RadioClass [color=" + color + "]";
	}

}
