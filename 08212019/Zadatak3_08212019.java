package nizovi;

import java.util.Scanner;

public class Zadatak3_08212019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci. Primer1 niza: 3 54 123 18 Ispis: Niz nije rastuci. Primer2 niza: 71
		 * 422 1001 5050 Ispis: Niz je rastuci.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Duzina niza");
		int d = sc.nextInt();
		int[] niz = new int[d];
		boolean rastuci = true;
		System.out.println("Unesi elemente niza");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();

		}
		for (int j = 0; j < d - 1; j++) {
			if (niz[j] >= niz[j + 1]) {
				rastuci = false;
				break;

			}
		}
		if (rastuci) {
			System.out.println("Niz je rastuci");
		} else {
			System.out.println("Niz je opadajuci");
		}
	}

}
