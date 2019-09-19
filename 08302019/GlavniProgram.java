package parcele;

public class GlavniProgram {
	/*
	 * Napisati i glavni program koji kreira niz parcela koje mogu da budu ili sume
	 * ili njive i ispisuje njihov prinos u toku 3 godine.
	 * 
	 */

	public static void main(String[] args) {
		Njiva n = new Njiva(600, 350);
		Njiva n1 = new Njiva(500, 250);
		Suma s = new Suma(700, 400, 300, 5);
		Suma s1 = new Suma(400, 250, 50, 3);
		Parcela[] niz2 = new Parcela[10];
		Parcela[] niz = { n, n1, s, s1 };
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}

	}

}
