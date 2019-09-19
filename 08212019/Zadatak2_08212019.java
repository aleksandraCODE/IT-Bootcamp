package nizovi;

import java.util.Scanner;

public class Zadatak2_08212019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n za duzinu niza:");
		int n = sc.nextInt();
		
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi element" + i);
			niz[i] = sc.nextInt();
		}
		System.out.println("Obrnuti redosled: ");
		
		for(int i=n-1; i>=0; i--)
			System.out.println(niz[i]);

	}

}
