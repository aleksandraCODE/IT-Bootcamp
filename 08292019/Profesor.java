package fakultetnew;

import java.util.ArrayList;

public class Profesor extends Covek {
	/*
	 * Profesor je covek koji ima titulu i listu predmeta na kojima drzi nastavu.
	 * Predmeti mogu da se dodaju i oduzimaju iz liste. Profesora ispisati u
	 * formatu: Ime_Prezime[godina rodjenja] je ___(titula) koji drzi nastavu na:
	 * <lista predmeta>.
	 * 
	 * 
	 */
	private String titula;
	private ArrayList<String> predmeti;

	public Profesor(String ime, String prezime, int godRodjenja, String titula) {
		super(ime, prezime, godRodjenja);
		this.titula = titula;
		this.predmeti = new ArrayList<String>();
	}

	public void dodatiPredmet(String predmet) {
		this.predmeti.add(predmet);

	}

	public void oduzmiPredmet(String predmet) {
		this.predmeti.remove(predmet);

	}

	public String ispis() {
		String p = "";
		for (int i = 0; i <= predmeti.size() - 1; i++) {
			p = p + "" + predmeti.get(i);

		}
		return super.ispis()+" je "+this.titula+" koji drzi nastavu na: "+p;
	}

}
