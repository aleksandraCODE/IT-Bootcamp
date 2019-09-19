package granjanje;

import java.util.Scanner;

public class Zadatak_01_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi ceo broj");
		int a=sc.nextInt(); 
		if (a%2==0) {
			System.out.println("Broj je paran!");
		}else {
			System.out.println("Broj je neparan!");
		}
	
	}


}
