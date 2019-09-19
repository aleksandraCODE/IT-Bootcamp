package fakultetnew;

public class Covek {
	/*
	 * Covek ima ime, prezime i godinu rodjenja. Ime i prezime mogu da se i dohvate
	 * i postave, dok godina rodjenja moze samo da se dohvati. Coveka ispisati u
	 * formatu: Ime_Prezime[godina rodjenja].
	 * 
	 */
	protected String ime;
	protected String prezime;
	protected int godRodjenja;

	public Covek(String ime, String prezime, int godRodjenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.godRodjenja = godRodjenja;

	}

	public String getIme() {
		return ime;

	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getGodRodjenja() {
		return godRodjenja;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String ispis() {
		return ime + prezime + "[" + godRodjenja + "]";
	}

}
