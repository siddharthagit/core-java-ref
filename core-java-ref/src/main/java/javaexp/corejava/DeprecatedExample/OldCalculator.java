package javaexp.corejava.DeprecatedExample;

/**
 * Sample Calculator which can add two numbers
 * 
 */

public class OldCalculator {

	/**
	 * Add two number and return the value as Number
	 * 
	 * @param a : First number
	 * @param b : Second number
	 * @return result of addition as Number
	 * @see Number
	 */
	public Number add(Number a, Number b) {
		return a.doubleValue() + b.doubleValue();
	}

	@Deprecated(forRemoval = false, since = "1.1")
	public Number add(CalParameter a, CalParameter b) {
		return a.val.doubleValue() + b.val.doubleValue();
	}

}

@Deprecated
class CalParameter {
	Integer val;
}
