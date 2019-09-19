package ucionica;

public class Laptop {
	private Polaznik polaznik;
	private String marka;

	public Laptop(String marka) {
		this.marka = marka;
		polaznik = null;
	}

	public String getMarka() {
		return marka;

	}

	public Polaznik getPolaznik() {
		return polaznik;
	}

	public void setPolaznik(Polaznik polaznik) {
		this.polaznik = polaznik;
	}

	public void resetPolaznik() {
		polaznik = null;

	}

	public String ispisi() {
		String a;

		if (polaznik == null) {
			a = "Nema polaznika";
		} else {
			a = polaznik.ispisi();
		}
		return marka + "{" + a + "}";
	}
}