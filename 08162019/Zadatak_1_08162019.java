package zadaciprimeri;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		/*
		 * Saberi prirodne brojeve do 100
		 */
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println("Suma brojeva do 100: " + sum);
	}

}
