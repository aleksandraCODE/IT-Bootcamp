package fakultetnew;

public class GlavniProgram {

	public static void main(String[] args) {
		/*
		 * Napisati glavni program koji ce imati bar tri studenta i dva profesora.
		 * 
		 * 
		 */
		Student s1 = new Student(" Ana ", " Radojicic ", 1986, "001/2019", 4, 7.8);
		System.out.println(s1.ispis());
		Student s2 = new Student(" Marko ", " Jovanovic ", 1990, "002/2019", 3, 8.6);
		System.out.println(s2.ispis());
		Student s3 = new Student(" Ivana ", " Petrovic ", 1984, "003/2019", 4, 9.5);
		System.out.println(s3.ispis());

		Profesor p1 = new Profesor(" Milos ", " Markovic ", 1966, " PHD ");
		p1.dodatiPredmet("Fizika");
		p1.dodatiPredmet("Matematika");
		System.out.println(p1.ispis());
		Profesor p2 = new Profesor(" Nikola ", " Mitic ", 1960, " PHD ");
		p2.dodatiPredmet("Fizika");
		p2.dodatiPredmet("Matematika");
		System.out.println(p2.ispis());

	}

}
