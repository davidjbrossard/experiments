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
//		System.out.println(product);
		if (product>9) {
			return doProduct(product.toString().toCharArray(),++iterationCount);
		} else {
			return iterationCount;
		}
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int max = 0;
		Long theSeed = 11L;
		Long seed = theSeed;
		while(true) {
			MultiplicativePersistence mp = new MultiplicativePersistence(seed);
			int iterations = mp.getIterations();
			if (iterations>max) {
				theSeed = seed;
				long now = System.nanoTime();
				long elapsedTime = Math.abs(now - startTime)/1000/1000; // ms
				System.out.println("Num: " + theSeed+ " It.: "+iterations + " (" + elapsedTime+ " ms)");
				max = iterations;
			}
			seed++;
		}

	}

}
