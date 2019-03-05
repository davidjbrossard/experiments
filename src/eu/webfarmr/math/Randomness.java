package eu.webfarmr.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class implements the math problem illustrated in Numberphile's video at
 * https://www.youtube.com/watch?v=tP-Ipsat90c
 * This is to demonstrate "Gambler's Fallacy"
 * @author djob
 *
 */
public class Randomness {
	public final static int MAX = 2000000000;

	public static void main(String[] args) {
		List<Boolean> tosses = generateTosses(MAX);
		Map<Integer, Integer> streaks = calculateStreaks(tosses);
		printResults(streaks);		
	}

	/**
	 * This method prints the results.
	 * @param streaks
	 */
	private static void printResults(Map<Integer, Integer> streaks) {
		for (Integer streak : streaks.keySet()) {
			System.out.println("Streak length " + streak + 
					           " occurred " + streaks.get(streak) + " times.");
		}
	}

	/**
	 * This method iterates over the list of tosses and counts the number of streaks
	 * where a streak is a series of same-valued entries. For instance FFF is a
	 * streak of 3 falses. FFF and TTT are both counted as a streak of 3 items.
	 * 
	 * @param tosses - the list of boolean values (coin tosses) where we want to count the streaks
	 * @return - the map of streak length to occurrences of the streak in the list of tosses.
	 */
	private static Map<Integer, Integer> calculateStreaks(List<Boolean> tosses) {
		Map<Integer, Integer> streaks = new TreeMap<Integer, Integer>();
		int streakLength = 0;
		Boolean previousToss = null;
		for (boolean toss : tosses) {
			System.out.println("toss: " + toss);
			if (previousToss == null || previousToss == toss) {
				streakLength++;
				previousToss = toss;
			} else {
				// We store the previous result in the following iteration
				streaks.put(streakLength, streaks.getOrDefault(streakLength, 0) + 1);
				streakLength = 1;
				previousToss = toss;
			}
		}
		// We need to store the last result
		streaks.put(streakLength, streaks.getOrDefault(streakLength, 0) + 1);
		return streaks;
	}

	/**
	 * Generate a list of randomly-generated coin tosses whereby true is tails and
	 * false is heads
	 * 
	 * @param count
	 * @return - a random list of tosses (T/F).
	 */
	private static List<Boolean> generateTosses(int count) {
		List<Boolean> tosses = new ArrayList<Boolean>();
		for (int i = 0; i < count; i++) {
			boolean toss = Math.random() < 0.5;
			// TODO: would the results changed if we had a different way of computing heads or tails?
			// TODO: what if we used Random.nextBoolean()?
			// See: https://stackoverflow.com/questions/8878015/return-true-or-false-randomly
			tosses.add(toss);
		}
		return tosses;
	}
}
