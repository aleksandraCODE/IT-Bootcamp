package cetvrtaned;

import java.util.Scanner;

public class Zadatak_2c_08132019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce sabrati sve brojeve od k do n (k i n uneti preko
		 * konzole). Program treba da ispise zbir.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite k i n:");
		int k = sc.nextInt();
		int n = sc.nextInt();
		int br = k;
		int sum = 0;
		while (br < n) {
			sum += br;
			br += 1;

		}

		System.out.println("Zbir svih brojeva je" + sum);
	}
}
