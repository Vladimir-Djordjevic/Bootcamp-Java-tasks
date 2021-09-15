package covek;

public class Putnik extends Covek {

//	Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja.
//	Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.  

	private int novac;

	public Putnik(String ime, String prezime, int novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public boolean dodavanjeNovca(int novac) {
		if (novac > 0) {

			this.novac += novac;
			System.out.println("Uspesno dodavanje novca");
			return true;

		} else {
			System.out.println("Bezuspesno dodavanje novca");
			return false;
		}

	}

	public boolean oduzimanjeNovca(int novac) {
		if (indikatorOdz(novac)) {
			this.novac -= novac;
			System.out.println("Uspeno oduzimanje novca!");
			return true;
		} else {
			return false;
		}

	}

	public boolean indikatorOdz(int novac) {
		if (this.getNovac() >= novac && novac > 0) {
			return true;
		} else {
			return false;

		}

	}

	public int getNovac() {
		return novac;
	}

	@Override
	public String toString() {
		return "Putnik: " + super.getIme() + " " + super.getPrezime() + " - Novac: " + this.getNovac() + "din";
	}

}
