package Automobil;

public class Automobil {
	// Zadatak 1:
//	Napraviti klasu automobil i dve main klase gde ce se u jednoj stampati podaci preko praznog konstruktora, 
//	a u drugom preko punog konstruktora. Atributi su marka, model, pogon, broj vrata i godiste.
//	Dodati private atribut "predjeniKm", napraviti geter i seter i odstampati posebno ili zajedno sa prethodnom stampom
//	Raditi u klasi gde je pun konstruktor
//	Zadatak 3:
//		Dodati atribute "potrosnjaGoriva" (int) i "kubikaza" (int). 
//		Ako kubikaza prelazi 1000 cm^3 onda stampati potrosnju da je 10 litara, ako je kubikaza ispod 1000 onda stampati da je potrosnja 8 litara.
//	Zadatak za domaci se nadovezuje na prethodni i glasi:
//		Izracunati koliko je ukupno novca potrosno na gorivo ako je cena jednog litra 120 dinara

	public String marka;
	public String model;
	public String pogon;
	public int brojVrata;
	public int godiste;
	private double predjeniKm;
	private int potrosnjaGoriva;
	private int kubikaza;
	private double novac;
	private int jedanLitar = 120;

	public Automobil(String marka, String model, String pogon, int brojVrata, int godiste) {
		this.marka = marka;
		this.model = model;
		this.pogon = pogon;
		this.brojVrata = brojVrata;
		this.godiste = godiste;
	}

	public Automobil() {
		// TODO Auto-generated constructor stub
	}

	public void stampa() {
		System.out.println("Marka: " + marka + "\nModel: " + model + "\nPogon: " + pogon + "\nBroj Vrata: " + brojVrata
				+ "\nGodiste: " + godiste + "-to " + "\nKilometraza predjena " + predjeniKm);
		System.out.println("Kubikaza : " + kubikaza + " potrosnja: " + potrosnjaGoriva + " litara"
				+ "\nNovac potrosen na gorivo: " + novac + " dinara");
	}

	public void setPredjeniKm(double km) {
		this.predjeniKm = km;
	}

	public double getPredjeniKm() {
		return predjeniKm;
	}

	public void setKubikaza(int kubik) {
		this.kubikaza = kubik;
		if (this.kubikaza > 1000) {
			this.potrosnjaGoriva = 10;
		} else {
			this.potrosnjaGoriva = 8;
		}

	}

	public int getKubikaza() {
		return this.kubikaza;

	}

	public int getportosnja() {
		return this.potrosnjaGoriva;

	}

	public void setNovac() {
		this.novac = this.getportosnja() * this.jedanLitar * this.getPredjeniKm() / 100;

	}

	public double getNovac() {
		return this.novac;

	}

}
