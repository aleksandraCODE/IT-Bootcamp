package cetvrtaned;

import java.util.Scanner;

public class Zadatak_2b_08132019 {

	public static void main(String[] args) {
		/*Napisati program koji ce sabrati sve brojeve od 1 do n (n uneti preko konzole).  
		 * Program treba da ispise zbir.
         */
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite n:");
		int n=sc.nextInt();
		int br=1;
		int sum=0;
		while(br<n) {
			sum+=br;
			br+=1;
		}
		System.out.println(sum);
	}

}
