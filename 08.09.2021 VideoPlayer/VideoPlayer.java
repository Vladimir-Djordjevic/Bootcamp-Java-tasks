package videoPlayer;

public class VideoPlayer {

//	// Kreirati klasu Video Player koja ima:
//	 duzinu videa
//	 trenutno vreme videa
//	 jacinu zvuka
//	 kvalitet videa (144, 240, 360, 480, 720, 1080)
//	 getere, setere i konstruktore
//	 metodu stampaj koja stampa podatke u formatu:
//	 trenutno vreme videa
//	 jacinu zvuka
//	 kvalitet videa

	private double duzinaVidea;
	private double trenutnoVremeVidea;
	private double jacinuZvuka;
	private int kvalitetVidea;

	public VideoPlayer(double duzinaVidea, double trenutnoVremeVidea, double jacinuZvuka, int kvalitetVidea) {
		this.duzinaVidea = duzinaVidea;
		this.trenutnoVremeVidea = trenutnoVremeVidea;
		this.jacinuZvuka = jacinuZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}

	public double getDuzinaVidea() {
		return duzinaVidea;
	}

	public void setDuzinaVidea(double duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}

	public double getTrenutnoVremeVidea() {
		return trenutnoVremeVidea;
	}

	public void setTrenutnoVremeVidea(double trenutnoVremeVidea) {
		this.trenutnoVremeVidea = trenutnoVremeVidea;
	}

	public double getJacinuZvuka() {
		return jacinuZvuka;
	}

	public void setJacinuZvuka(double jacinuZvuka) {
		this.jacinuZvuka = jacinuZvuka;
	}

	public int getKvalitetVidea() {
		return kvalitetVidea;
	}

	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}

	public void stampa() {
		System.out.println("Trenutno vreme videa: " + this.trenutnoVremeVidea + "s" + "\nJacina zvuka: "
				+ this.jacinuZvuka + "db" + "\nKvalitet videa: " + this.kvalitetVidea + "p");
	}

}
