package videoPlayer;

import java.util.ArrayList;

public class GlavnaKlasa {

	public static void main(String[] args) {
//		U glavnom programu kreirati video player i izvrsiti neke akcije nad njim
//		 U glavnom programu kreirati listu akcija i izvrsiti ih nad istim playerom

		VideoPlayer v1 = new VideoPlayer(145, 40, 97, 1080);
		v1.stampa();

		System.out.println("--------Dodavanje trenutnog vremena videa----------");

		TimeControl t1 = new TimeControl(true);
		t1.izvrsiAkciju(v1);
		v1.stampa();

		System.out.println("--------Pojacavnje zvuka ------------");

		AudioControl a1 = new AudioControl(true);
		a1.izvrsiAkciju(v1);
		v1.stampa();

		System.out.println("--------Odredjivanje kvaliteta na osnovu brzine interneta----------");

		QualityOptimizerControl o1 = new QualityOptimizerControl(60);
		o1.izvrsiAkciju(v1);
		v1.stampa();

		System.out.println("--------Lista akcija----------");

		ArrayList<Control> akcije = new ArrayList<Control>();
		akcije.add(t1);
		akcije.add(a1);
		akcije.add(o1);

		for (int i = 0; i < akcije.size(); i++) {
			akcije.get(i).izvrsiAkciju(v1);

		}

		v1.stampa();

	}

}
