package javaexp.corejava.collection;
import javaexp.corejava.DeprecatedExample.OldCalculator;
public class AndAndAnd {

	public static void main(String[] args) {

		AndAndAnd and = new AndAndAnd();

		System.out.println("apple || banana");
		if (appleIsFruit() || bananaIsFruit()) {
			System.out.println("inside apple || banana");
		}

		System.out.println("\n\napple | banana");
		if (appleIsFruit() | bananaIsFruit()) {
			System.out.println("inside apple | banana");
		}

		System.out.println("\n\ncloud && apple");
		if (cloudIsfruit() && appleIsFruit()) {
			System.out.println("inside cloud && apple");
		}

		System.out.println("\n\ncloud & apple");
		if (cloudIsfruit() & appleIsFruit()) {
			System.out.println("inside cloud & apple");
		}
	}

	private static boolean appleIsFruit() {
		System.out.println("calling apple ");
		return true;
	}

	private static boolean bananaIsFruit() {
		System.out.println("calling banana ");
		return true;
	}

	private static boolean cloudIsfruit() {
		System.out.println("calling cloud ");
		OldCalculator ss;
		return false;
	}

}
