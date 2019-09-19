package cetvrtaned;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce ispisati n brojeva Fibonacijevog niza. (Na internetu
		 * istraziti sta je Fibonacijev niz!!!)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ceo broj da dobijete Fibonacijev niz");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum, i;

		System.out.println(a);
		System.out.println(b);

		for (i = 2; i <= n; ++i) {
			sum = a + b;
			a = b;
			b = sum;
			{
				System.out.println(sum);
			}

		}
	}
}
