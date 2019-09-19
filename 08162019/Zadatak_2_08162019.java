package zadaciprimeri;

public class Zadatak_2_08162019 {

	public static void main(String[] args) {
		/*
		 * Ispisati prirodne brojeve od 1 do 17 koji su deljivi sa 3.
		 */

		int i;
		for (i = 1; i <= 17; i++) {
			if (i % 3 == 0)
				System.out.println(i);
		}
	}

}
