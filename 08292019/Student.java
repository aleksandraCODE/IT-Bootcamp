package fakultetnew;

public class Student extends Covek {
	/*
	 * Student je covek koji se kreira sa brojem indeksa i ima trenutnu godinu
	 * studija i trenutni prosek. Sva polja mogu samo da se dohvate. Studenta
	 * ispisati u formatu: Ime_Prezime[godina rodjenja] je student ___ (god studija)
	 * godine studija sa prosekom____ (trenutni prosek).
	 * 
	 * 
	 */
	private String brIndeksa;
	private int trGodStudija;
	private double trProsek;

	public Student(String ime, String prezime, int godRodjenja, String brIndeksa, int trGodStudija, double trProsek) {
		super(ime, prezime, godRodjenja);
		this.brIndeksa = brIndeksa;
		this.trGodStudija = trGodStudija;
		this.trProsek = trProsek;

	}

	public String getBrIndeksa() {
		return brIndeksa;
	}

	public int getTrGodStudija() {
		return trGodStudija;
	}

	public double getTrProsek() {
		return trProsek;
	}

	public String ispis() {
		return super.ispis() + " je student " + trGodStudija + " godina studija sa prosekom " + trProsek;
	}
}
