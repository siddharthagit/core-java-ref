package com.fullstacksref.languagefeatures;

public class My24Class {

	record Point(int x, int y) {}
	String s = "";
	
	public static void main(String[] args) {
		MyClass mc = new MyClass("");
		mc.checkIt2( new Point(0, 0));
	}
}

class MyClass extends Base {
	MyClass(String input) {
		if (input == null)
			throw new IllegalArgumentException();
		super(input); // Now allowed
	}

	public boolean checkIt(Object obj) {
		if (obj instanceof String _) {
			System.out.println("Matched a String_");
		}

		if (obj instanceof String s) {
			System.out.println("Matched a String" + s);
		}

		return false;

	}
	
	public boolean checkIt2(com.fullstacksref.languagefeatures.My24Class.Point obj) {
		if (obj instanceof com.fullstacksref.languagefeatures.My24Class.Point(int _, int y)) {
			System.out.println("Y value is: " + y);
		}

		
		return false;

	}


}