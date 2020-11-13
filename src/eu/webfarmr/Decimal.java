package eu.webfarmr;

import java.text.DecimalFormat;

public class Decimal {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println(df.format(0.912385));
		System.out.printf("%.2f",0.912385);
	}
}
