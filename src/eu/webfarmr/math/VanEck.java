package eu.webfarmr.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Van Eck's sequence: For n >= 1, if there exists an m < n such that a(m) =
 * a(n), take the largest such m and set a(n+1) = n-m; otherwise a(n+1) = 0.
 * Start with a(1)=0.
 * @see https://oeis.org/A181391
 * @see https://www.youtube.com/watch?v=etMJxB-igrc
 * @author djob
 *
 */
public class VanEck {
	private final static Integer[] A181391 = new Integer[] { 0, 0, 1, 0, 2, 0, 2, 2, 1, 6, 0, 5, 0, 2, 6, 5, 4, 0, 5, 3,
			0, 3, 2, 9, 0, 4, 9, 3, 6, 14, 0, 6, 3, 5, 15, 0, 5, 3, 5, 2, 17, 0, 6, 11, 0, 3, 8, 0, 3, 3, 1, 42, 0, 5,
			15, 20, 0, 4, 32, 0, 3, 11, 18, 0, 4, 7, 0, 3, 7, 3, 2, 31, 0, 6, 31, 3, 6, 3, 2, 8, 33, 0, 9, 56, 0, 3, 8,
			7, 19, 0, 5, 37, 0, 3, 8, 8, 1 };

	public static void main(String[] args) {
		List<Integer> series = new ArrayList<Integer>();
		int currentNumber = 0;
		series.add(currentNumber); // we initiate the series with 0
		for (int i = 0; i < 100; i++) {
			boolean knownNumber = series.contains(currentNumber);
			// Determine the position before adding the number to the list
			int position = series.lastIndexOf(currentNumber);
			series.add(currentNumber);
			currentNumber = knownNumber ? series.size() - position - 1 : 0;
		}
		for (int i = 0; i < series.size(); i++) {
			System.out.println(i + ": " + series.get(i));
		}
		System.out.println(VanEck.isVanEck(series));
	}

	public static boolean isVanEck(List<Integer> series) {
		int i = 0;
		while (i < A181391.length && i < series.size()) {
			if (series.get(i) != A181391[i]) {
				return false;
			}
			i++;
		}
		return true;
	}
}

// 0, 0, 1, 0, 2, 0, 2, 2, 1, 6, 0, 5, 0, 2, 6, 5, 4, 0, 5
// See https://en.wikipedia.org/wiki/Van_Eck%27s_sequence