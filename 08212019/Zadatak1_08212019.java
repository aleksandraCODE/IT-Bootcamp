package nizovi;

import java.util.Scanner;

public class Zadatak1_08212019 {
	/*Korisnik ucitava niz od n elemenata niza, 
	 * kao i neko broj br. Program ispisuje elemente niza deljive brojem br.

	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n za duzinu niza:");
		int n = sc.nextInt();
		System.out.println("Unesi broj br");
		int br= sc.nextInt();
		
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi element" + i);
			niz[i] = sc.nextInt();
		}
		System.out.println("Niz uspesno unesen!");
		for (int i = 0; i < niz.length; i++) {
			if(niz[i]%br==0)
			System.out.println(niz[i]);
	}

}
}
