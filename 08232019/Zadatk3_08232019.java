package nizovi;

import java.util.Scanner;

public class Zadatk3_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava niz od n celih brojeva i dve metode.
		// Prva metoda vraca proizvod elemenata na neparnim pozicijama,
		// a druga vraca zbir parnih elemenata niza.

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi broj elemenata u nizu ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		ucitan(niz);
		proizvodNeparni(niz);
		zbirParni(niz);
	}

	public static void ucitan(int[] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesi element niza " + i + " ");
			niz[i] = sc.nextInt();
		}
	}

	public static void proizvodNeparni(int[] niz) {
		int p = 1;
		for (int i = 0; i < niz.length; i++) {
			if (i % 2 == 1) {
				p = p * niz[i];
			}
		}
		System.out.println("Proizvod elemenata na neparnim pozicijama je " + p);
	}

	public static void zbirParni(int[] niz) {
		int sum = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				sum = sum + niz[i];
			}
		}
		System.out.println("Zbir parnih elemenata je " + sum);

	}

}