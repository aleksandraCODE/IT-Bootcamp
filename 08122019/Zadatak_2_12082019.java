package cetvrtaned;

import java.util.Scanner;

public class Zadatak_2_12082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n:");
		int n = sc.nextInt();
		int br = 0;
		int sumparnih = 0;
		int proizvodneparnih = 1;
		while (br <= n)
			if (br % 2 == 0) {
				sumparnih += br;
				br += 1;
			} else {
				proizvodneparnih *= br;
				br += 1;
			}
		{
			System.out.println("Zbir svih parnih brojeva je" + sumparnih);
			System.out.println("Proizvod svih neparnih brojeva je " + proizvodneparnih);
		}

	}
}
