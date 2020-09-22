package eu.webfarmr.math;

import java.util.ArrayList;
import java.util.List;

public class Eck {
	public static void main(String[] args) {
		List<Integer> series = new ArrayList<Integer>();
		int currentNumber = 0;
		for (int i = 0; i < 100; i++) {
			boolean knownNumber = series.contains(currentNumber);
			series.add(currentNumber);
			if (knownNumber) {
				currentNumber = series.size() - series.lastIndexOf(currentNumber) - 1;
			} else {
				currentNumber = 0;
			}
		}
		for (int i = 0 ; i < series.size(); i++) {
			System.out.println(i+": "+series.get(i));
		}
	}
}

// 0,0,1,0,2