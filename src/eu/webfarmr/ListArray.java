package eu.webfarmr;

import java.util.Arrays;
import java.util.List;

public class ListArray {
	public static void main(String[] args) {
		String[][] array = new String[][] { { "hello", "example", "one" }, { "cheerio", "another example", "two" } };
		List<String[]> list = Arrays.asList(array);

		for (String[] a : list) {
			for (String s : a) {
				System.out.println(s);
			}
		}
	}
}
