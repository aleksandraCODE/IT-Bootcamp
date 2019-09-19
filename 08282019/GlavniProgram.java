package ucionica;

public class GlavniProgram {

	public static void main(String[] args) {
		Polaznik p1 = new Polaznik("Aleksandra Radojicic");
		Laptop l1 = new Laptop("HP");
		l1.setPolaznik(p1);
		System.out.println(p1.ispisi());
	    System.out.println(l1.ispisi());
	    l1.resetPolaznik();
		System.out.println(l1.ispisi());
	}

}