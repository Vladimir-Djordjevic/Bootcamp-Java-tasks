package covek;

import java.util.ArrayList;

public class Autobus {
//	Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze. Naziv i cena karte i zadaju se prilikom kreiranja.
//	Moguce je dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima samo ako je vozac prisutan.
	private String naziv;
	private Vozac vozac;
	private int cenaKarte;
	private ArrayList<Putnik> listaPutnika;

	public Autobus(String naziv, int cenaKarte) {
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		listaPutnika = new ArrayList<Putnik>();

	}

	public void dodatiVozaca(Vozac a) {
		if (vozac == null) { // dodati vozaca samo ako ga vec nema
			this.vozac = a;

		}

	}

	public void uklonitiVozaca() {
		this.vozac = null;
	}

	public void dodatiPutnika(Putnik a) {
		this.listaPutnika.add(a);
	}

	public void uklonitiPutnika(Putnik a) {
		this.listaPutnika.remove(a);
	}

	public void naplataKarte() {
		for (int i = 0; i < listaPutnika.size(); i++) {
			if (vozac != null) { // ako je vozac prisutan naplati kartu svima
				this.listaPutnika.get(i).oduzimanjeNovca(this.cenaKarte);
			}

		}

	}

	@Override
	public String toString() {
		String vozacAutobusa = "";
		if (this.vozac == null) {
			vozacAutobusa = "Autobus nema vozaca";
		} else {
			vozacAutobusa = "Autobus ima vozaca " + this.vozac.getIme() + " " + this.vozac.getPrezime();
		}
		return "Naziv autobusa: " + naziv + " - Cena karte:" + cenaKarte + "din" + " - Putnici u autobusu: "
				+ listaPutnika + "\n" + vozacAutobusa;

	}

}
