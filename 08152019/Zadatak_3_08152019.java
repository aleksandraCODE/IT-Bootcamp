package cetvrtaned;

import java.util.Scanner;

public class Zadatak_3_08152019 {

	public static void main(String[] args) {
		/*Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:

		 * */
	    Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj redova");
		int a= sc.nextInt();
		System.out.println("Unesi broj kolona");
		int b=sc.nextInt();
		
		
		for (int i = 1; i <= a; i++)
		{
		for (int j = 1; j <= b; j++) {
				System.out.print("*  ");
			}
			System.out.print("\n");
		}
		
	}

}
