package videoPlayer;

public class TimeControl extends Control {

//		Kreirati klasu TimeControl koja nasledjuje klasu Control i konstruktore,
//		ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean), 
//		implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili 
//		unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.

	private boolean pomeraVideo;

	public TimeControl(boolean pomeraVideo) {
		this.pomeraVideo = pomeraVideo;
	}

	public boolean isPomeraVideo() {
		return pomeraVideo;
	}

	public void setPomeraVideo(boolean pomeraVideo) {
		this.pomeraVideo = pomeraVideo;
	}

	public void izvrsiAkciju(VideoPlayer v) {
		if (pomeraVideo) {
			if (v.getTrenutnoVremeVidea() < v.getDuzinaVidea() - 15) {
				v.setTrenutnoVremeVidea(v.getTrenutnoVremeVidea() + 15);
			} else {
				v.setTrenutnoVremeVidea(v.getDuzinaVidea());
			}
		}
		if (!pomeraVideo) {
			if (v.getTrenutnoVremeVidea() > 15) {
				v.setTrenutnoVremeVidea(v.getTrenutnoVremeVidea() - 15);

			} else {
				v.setTrenutnoVremeVidea(0);
			}
//		
		}

	}
}
