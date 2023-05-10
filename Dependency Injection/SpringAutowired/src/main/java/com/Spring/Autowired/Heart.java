package com.Spring.Autowired;

public class Heart {
	private String noOfHeart;
	public String getNoOfHeart() {
		return noOfHeart;
	}
	public void setNoOfHeart(String noOfHeart) {
		this.noOfHeart = noOfHeart;
	}
	//@autowired - this is only used for object type not for string or primitive types
	public void heartFunction() {

		System.out.println("NO of Heart are" + noOfHeart);
		System.out.println("My heart is beating");
	}

}
