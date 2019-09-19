package citanje;

public class GlavniProgramKnjiga {

	public static void main(String[] args) {
		Knjiga a = new Knjiga("Mracna Kula", "Stiven King", 222);
		a.setgodIzdanja(1982);
		System.out.println("Naziv knjige: " + a.getNaziv() + "  " + "Naziv autora: " + a.getAutor() + "  "
				+ "Broj strana: " + a.getbrStrana() + "  " + "Godina izdanja: " + a.godIzdanja);
		Knjiga b = new Knjiga("Put kojim se redje ide", "Skot Pek", 253);
		b.setgodIzdanja(2012);
		System.out.println("Naziv knjige: " + b.getNaziv() + "  " + "Naziv autora: " + b.getAutor() + "  "
				+ "Broj strana: " + b.getbrStrana() + "  " + "Godina izdanja: " + b.godIzdanja);
		Knjiga c = new Knjiga("Pet Prstenova", "Mijamoto Musasi", 55);
		c.setgodIzdanja(1645);
		System.out.println("Naziv knjige: " + c.getNaziv() + "  " + "Naziv autora: " + c.getAutor() + "  "
				+ "Broj strana: " + c.getbrStrana() + "  " + "Godina izdanja: " + c.godIzdanja);
	}

}
