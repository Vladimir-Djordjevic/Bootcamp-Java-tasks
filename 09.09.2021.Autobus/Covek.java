package covek;

public class Covek {

//	Otezana verzija za vezbu:
//		Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta. Svi podaci mogu da se dohvate, ali ne i postave.

	private String ime;
	private String prezime;

	public Covek(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	@Override
	public String toString() {
		return "Ime: " + ime + " - Prezime: " + prezime;
	}

}
