package videoPlayer;

public class AudioControl extends Control {
//	Kreirati klasu AudioControl koja nasledjuje klasu Control i getere, setere i konstruktore.
//	Ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean). 
//	Implementirati metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100.

	private boolean zvuk;

	public AudioControl(boolean zvuk) {

		this.zvuk = zvuk;
	}

	public boolean isZvuk() {
		return zvuk;
	}

	public void setZvuk(boolean zvuk) {
		this.zvuk = zvuk;
	}

	public void izvrsiAkciju(VideoPlayer v) {
		if (zvuk) {
			if (v.getJacinuZvuka() < 100) {
				v.setJacinuZvuka(v.getJacinuZvuka() + 1);
			} else {
				v.setJacinuZvuka(100);
			}
		} else {
			if (v.getJacinuZvuka() > 0) {
				v.setJacinuZvuka(v.getJacinuZvuka() - 1);
			} else {
				v.setJacinuZvuka(0);
			}
		}
	}

}
