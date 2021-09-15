package videoPlayer;

public class QualityOptimizerControl extends Control {
//	Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i ima brzinu interneta u megabitima npr 10mb/s 20mb/s...
//	Getere, setere i konstruktore. Implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta.
//	 Kvalitet se racuna na osnovu formule: brzina interneta * 10.1 gde se uzima prvi veci kvalitet
//	 ako je brzina 20 * 10.1 = 204 - postavlja 240;
//	 ako je brzina 5*10.1 = 50.5 - postavlja 144;
//	 ako je brzina 20*10.1 = 505 - postavlja 720;

	private int brzinaInterneta;

	public QualityOptimizerControl(int brzinaInterneta) {
		super();
		this.brzinaInterneta = brzinaInterneta;
	}

	public int getBrzinaInterneta() {
		return brzinaInterneta;
	}

	public void setBrzinaInterneta(int brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}

	public void izvrsiAkciju(VideoPlayer v) {
		double kvalitet = brzinaInterneta * 10.1;
		if (kvalitet <= 144) {
			v.setKvalitetVidea(144);
		} else if (kvalitet <= 240) {
			v.setKvalitetVidea(240);
		} else if (kvalitet <= 480) {
			v.setKvalitetVidea(480);
		} else if (kvalitet <= 720) {
			v.setKvalitetVidea(720);
		} else {
			v.setKvalitetVidea(1080);
		}

	}

}
