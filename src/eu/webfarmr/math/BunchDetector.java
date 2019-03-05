package eu.webfarmr.math;

public class BunchDetector {
	private static int countBunches(int[] numbers){
		Integer previous = null;
		int bunch = 0;
		for (int i = 0; i < numbers.length; i++){
			if (previous!=null){
				if (previous==numbers[i]){
					bunch++;
					while (i < numbers.length && previous==numbers[i++] ){}	
				}
			}
			if (i < numbers.length){
				previous = numbers[i];
			}
		}
		return bunch;
	}
	
	public static void main(String[] args) {
		System.out.println(BunchDetector.countBunches(new int[]{1,1,2,3,4,5}));
		System.out.println(BunchDetector.countBunches(new int[]{1,1,2,3,4,5,7,7,7,8,9}));
		System.out.println(BunchDetector.countBunches(new int[]{1,2,3,4,5,7,7,7,8,9,11,11}));
		System.out.println(BunchDetector.countBunches(new int[]{1,2,3,4,5,7,7,7,8,9,11,11,13,13,13,13,13}));
	}
}
