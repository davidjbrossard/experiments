package eu.webfarmr.math;

public class MultiplicativePersistence {
	
	private Long number;

	public MultiplicativePersistence(Long number) {
		this.number = number;
	}
	
	public int getIterations() {
		char[] digits = number.toString().toCharArray();
		return doProduct(digits, 1);
	}
	
	private int doProduct(char[] digits, int iterationCount) {
		Long product = 1L;
		for (int i = 0; i < digits.length; i++) {
			product = product * Character.getNumericValue(digits[i]);
		}
		System.out.println(product);
		if (product>9) {
			return doProduct(product.toString().toCharArray(),++iterationCount);
		} else {
			return iterationCount;
		}
	}
	
	public static void main(String[] args) {
		long seed = 3472;
		MultiplicativePersistence mp = new MultiplicativePersistence(seed);
		System.out.println("Iteration count: " + mp.getIterations());

	}

}
