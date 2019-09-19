package nizovi;

import java.util.Scanner;

public class Zadatak1_08222019 {

	public static void main(String[] args) {
		// Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve
		// metode(u mainu).
		// Prva metoda vraca proizvod unetih brojeva. Druga metoda ispisuje najmanji od
		// unesenih brojeva.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi 3 realna broja ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		System.out.print("Proizvod unetih brojeva " + proizvod(a, b, c));
		System.out.println();
		System.out.print("Najmanji od unetih brojeva " + minbr(a, b, c));
	}

	public static double proizvod(double x, double y, double z) {
		double p;
		p = x * y * z;
		return p;
	}

	public static double minbr(double x, double y, double z) {
		if (x < y && x < z) {
			return x;
		} else if (y < x && y < z) {
			return y;
		} else {
			return z;
		}
	}

}
