package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = 20;
		int y = 10;
		int z = 5;
		
		boolean isOrdered = ((x > y) && (y > z));

		System.out.println(isOrdered);
		
	}

}
