package zadaciprimeri;

import java.util.Scanner;

public class Zadatak_3_08162019 {

	public static void main(String[] args) {
		/*
		 * Napisati program da proveri da li je upisani broj pozitivan, negativan ili
		 * nula i to ispiše.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj");
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println("Broj je pozitivan");
		} else if (n < 0) {
			System.out.println("Broj je negativan");
		} else {
			System.out.println("Broj je nula");
		}
	}
}