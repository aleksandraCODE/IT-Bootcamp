package cetvrtaned;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		/*
		 * Napisati program - meni - za izracunavanje i ispis povrsina geometrijskih
		 * tela (kocke, kvadra, valjka, lopte). Koristiti do while petlju i switch
		 * grananje. Za izlaz koristiti nulu (0).
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int izbor;
		do {
			System.out.println("Izaberi ponudjeno:");
			System.out.println("0 - Izlaz");
			System.out.println("1 - Povrsina kocke");
			System.out.println("2 - Povrsina kvadra");
			System.out.println("3 - Povrsina valjka");
			System.out.println("4 - Povrsina lopte");
			izbor = sc.nextInt();
			double a, b, c, r, H;
			switch (izbor) {

			case 1:
				System.out.println("Unesi stranicu a");
				a = sc.nextDouble();
				System.out.println(6 * a * a);
				break;
			case 2:
				System.out.println("Unesi a,b,c");
				a = sc.nextDouble();
				b = sc.nextDouble();
				c = sc.nextDouble();
				System.out.println(2 * (a * b + b * c + c * a));
				break;
			case 3:
				System.out.println("Unesi r i H");
				r = sc.nextDouble();
				H = sc.nextDouble();
				System.out.println(2 * r * 3.14 * (r + H));
				break;
			case 4:
				System.out.println("Unesi r");
				r = sc.nextDouble();
				System.out.println(4*r*r*3.14);
				break;
			case 0:
				System.out.println("Izlaz iz aplikacije");
				break;

			}
		} while (izbor != 0);

	}
}
