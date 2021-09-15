package raspustDomaci;

import java.util.ArrayList;

public class Glumci {

	// Zadaci za raspust:

//	Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina rodjenja, pol. 
//	Private atributi su: da li su ozenjeni ili udati (boolean), prosecna zarada po filmu, broj snimljenih filmova.
//	Potrebno je izracunati i odstampati sve atribute, koliko su ukupno zaradili u svim filmovima,
//	koliko godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena da se doda "Mr." ili "Mrs." ako su zenskog pola.
//	Nakon toga napraviti Array listu gde ce se ubaciti poslednjih 5 snimljenih filmova
//	(pored naslova napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore ocenjenog filma od tih pet (preko getera i setera).
//	Jedna glavna klasa ali odstampajte bar za jednog glumca i bar za jednu glumicu

	public String imeIPrezime;
	public int godinaRodjenja;
	public String pol;
	private boolean vencani;
	private double prosecnaZaradaPoFilmu;
	private int brojSnimljenihFilmova;
	double ukupnaZarada;

	public ArrayList<Filmovi> listaFilmova = new ArrayList<Filmovi>();

	public Glumci(String imeIPrezime, int godinaRodjenja, String pol, boolean vencani, double prosecnaZaradaPoFilmu,
			int brojSnimljenihFilmova) {
		if (pol.equalsIgnoreCase("Muski")) {
			this.imeIPrezime = "Mr. " + imeIPrezime;

		} else if (pol.equalsIgnoreCase("Zenski")) {
			this.imeIPrezime = "Mrs. " + imeIPrezime;
		} else {
			this.imeIPrezime = " " + imeIPrezime;
		}

		this.godinaRodjenja = godinaRodjenja;
		this.pol = pol;
		this.vencani = vencani;
		this.prosecnaZaradaPoFilmu = prosecnaZaradaPoFilmu;
		this.brojSnimljenihFilmova = brojSnimljenihFilmova;

	}

	public void setVencani(boolean vencani) {
		this.vencani = vencani;
	}

	public boolean getVencani() {
		return vencani;
	}

	public void setProsecnaZaradaPoFilmu(double prosecnaZaradaPoFilmu) {
		this.prosecnaZaradaPoFilmu = prosecnaZaradaPoFilmu;
	}

	public double getProsecnaZaradaPoFilmu() {
		return prosecnaZaradaPoFilmu;
	}

	public void setBrojSnimljenihFilmova(int brojSnimljenihFilmova) {
		this.brojSnimljenihFilmova = brojSnimljenihFilmova;
	}

	public int getBrojSnimljenihFilmova() {
		return brojSnimljenihFilmova;
	}

	public double zarada() {

		return ukupnaZarada = prosecnaZaradaPoFilmu * brojSnimljenihFilmova;

	}

	public int godine() {
		return 2022 - godinaRodjenja;
	}

	public void setFimovi(double ocenaAdd, String filmoviImb) {
		Filmovi film1 = new Filmovi(ocenaAdd, filmoviImb);
		if (!listaFilmova.contains(film1)) {
			listaFilmova.add(film1);
		}
	}

	public ArrayList<Filmovi> sortiranaLista() {
		for (int i = 0; i < listaFilmova.size(); i++) {
			for (int j = listaFilmova.size() - 1; j > i; j--) {
				if (listaFilmova.get(i).ocena < listaFilmova.get(j).ocena) {
					Filmovi t = listaFilmova.get(i);
					listaFilmova.set(i, listaFilmova.get(j));
					listaFilmova.set(j, t);

				}

			}

		}
		return listaFilmova;

	}

	public ArrayList<Filmovi> getListaFilmova() {
		return listaFilmova;

	}

	public void display() {
		System.out.println("Ime i prezime: " + imeIPrezime + "\nGodina Rodjenja: " + godinaRodjenja + "\nPol: " + pol
				+ "\nVencani: " + getVencani() + "\nProsecna zarada po filmu: " + getProsecnaZaradaPoFilmu()
				+ "\nBroj Snimljenih Filmova: " + getBrojSnimljenihFilmova() + "\nUkupna zarada: " + zarada()
				+ "\nU 2022 Napunice " + godine() + " godine");
		System.out.println("Lista od 5 sortiranih snimljenih filmova: ");
		for (int i = 0; i < listaFilmova.size(); i++) {
			System.out.println(this.sortiranaLista().get(i).ocena + ", " + this.sortiranaLista().get(i).naziv);
		}

	}

}
