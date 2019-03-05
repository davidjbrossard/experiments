package eu.webfarmr.math;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

public class NumberReader {
	public static void main(String[] args) throws Exception {
		// 1. Determine the input location
		FileInputStream fis = new FileInputStream("c:/temp/file.txt");
		
		// 2. Read the contents of the file into a single string
		byte[] contentBytes = new byte[255];
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		while (fis.read(contentBytes)!=-1){
			bos.write(contentBytes);
		}
		fis.close();
		String contents = bos.toString();
		System.out.println(contents);
		
		// 3. Parse the string and split according to the system's endline
		String[] lines = contents.split(System.getProperty("line.separator"));
		int product = 1;
		for (String line : lines){
			String[] numbers = line.trim().split(" ");
			for (String number : numbers){
				System.out.println("number read: "+number);
				Integer convertedNumber = Integer.parseInt(number.trim());
				product = product * convertedNumber;
				System.out.println("new product: "+product);
			}
		}
		
	}
}
