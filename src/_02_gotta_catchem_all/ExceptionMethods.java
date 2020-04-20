package _02_gotta_catchem_all;

public class ExceptionMethods {

	public static double divide(double x, double y) throws IllegalArgumentException {
		if (y == 0.0) {
			throw new IllegalArgumentException();
		} else {
			return x / y;
		}
	}

	public static String reverseString(String s) throws IllegalStateException {
		if (s.equals("")) {
			throw new IllegalStateException();
		} else {
			String newS = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				newS = newS + s.charAt(i);
			}
			return newS;
		}
	}
}
