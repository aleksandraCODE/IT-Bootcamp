package granjanje;

import java.util.Scanner;

public class Zadatak_02_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi Krug, Pravougaonik ili Kvadrat");
		String s = sc.nextLine();
		switch (s) {
		case "Pravougaonik":
			System.out.println("Unesi stranice a i b pravougaonika");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			double p=a*b;
			
			System.out.println("Povrsina pravougaonika je:"+p);
			break;
			
		case "Krug":
			System.out.println("Unesi poluprecnik kruga");
			double r=sc.nextDouble();
			double po=r*r*3.14;
			System.out.println("Povrsina kruga je:"+po);
			break;
			
		case "Kvadrat":
			System.out.println("Unesi stranicu kvadrata");
			double k=sc.nextDouble();
			double pk=k*k;
			System.out.println("Povrsina kvadrata je:"+pk);
			break;
		default:
			System.out.println("Greska! Ukucajte Krug, Pravougaonik ili Kvadrat");
		}	
	}

}
