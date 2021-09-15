package DomaciZooVrt;

public class Ribe extends Kicmenjaci {

	private String mestoObitavanja;
	private int brojPeraja;
	private String vrstaPeraja;

	public Ribe(String vrsta, String naziv, String hrana, String mestoObitavanja, int brojPeraja, String vrstaPeraja) {
		super(vrsta, naziv, hrana);
		this.mestoObitavanja = mestoObitavanja;
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = vrstaPeraja;
	}

	public String getMestoObitavanja() {
		return mestoObitavanja;
	}

	public void setMestoObitavanja(String mestoObitavanja) {
		this.mestoObitavanja = mestoObitavanja;
	}

	public int getBrojPeraja() {
		return brojPeraja;
	}

	public void setBrojPeraja(int brojPeraja) {
		this.brojPeraja = brojPeraja;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}

	public void stampaj() {
		System.out.println("Vrsta: " + super.getVrsta() + "\nNaziv: " + super.getNaziv() + "\nHrana: "
				+ super.getHrana() + "\nMesto obitavanja: " + this.mestoObitavanja + "\nBroj peraja: " + this.brojPeraja
				+ "\nVrsta peraja: " + this.vrstaPeraja);
	}

}
