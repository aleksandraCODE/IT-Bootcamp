package citanje;

public class Knjiga {

	private String naziv;
	private String autor;
	private int brStrana;
	public int godIzdanja;

	public Knjiga(String naziv, String autor, int brStrana) {
		this.naziv = naziv;
		this.autor = autor;
		this.brStrana = brStrana;

	}

	public String getNaziv() {
		return naziv;
	}

	public String getAutor() {
		return autor;
	}

	public int getbrStrana() {
		return brStrana;
	}

	public int getGodIzdanja() {
		return godIzdanja;
	}

	public void setgodIzdanja(int godIzdanja) {
		this.godIzdanja = godIzdanja;
	}
}