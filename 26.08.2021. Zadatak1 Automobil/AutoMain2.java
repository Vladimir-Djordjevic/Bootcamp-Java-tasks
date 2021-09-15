package Automobil;

public class AutoMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automobil porse = new Automobil("Carera", "1344", "na 4 tocka", 4, 2019);
		Automobil fiat = new Automobil("Fica", "1123", "na 2 tocka", 2, 2000);

		porse.setPredjeniKm(500);
		System.out.println("Predjeni km: " + porse.getPredjeniKm());

		porse.setKubikaza(1000);
		System.out.println(porse.getKubikaza());
		System.out.println(porse.getportosnja());
		porse.setNovac();
		porse.stampa();
		// System.out.println("Novac utrosen na gorivo je: " +porse.getNovac());

		fiat.setPredjeniKm(998);
		fiat.setKubikaza(800);
		fiat.setNovac();
		fiat.stampa();

	}

}
