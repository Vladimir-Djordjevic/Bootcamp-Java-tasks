package covek;

public class MainCovek {
	public static void main(String[] arg) {

		Covek persona1 = new Covek("Vlada", "Vladimirovic");
//		System.out.println(persona1);          

		Putnik putnik1 = new Putnik("Pavle", "Vujisic", 5000);
		Putnik putnik2 = new Putnik("Dragan", "Nikolic", 4000);
		Putnik putnik3 = new Putnik("Bata", "Stojkovic", 4000);

		System.out.println(putnik1);
		putnik1.dodavanjeNovca(200);
//                                             Provera dodavanja i oduzimanje novca
		putnik1.oduzimanjeNovca(50);
		System.out.println(putnik1);

		Vozac vozac1 = new Vozac("Aleksandar", "Bercek");
//		System.out.println(vozac1);
		Vozac vozac2 = new Vozac("Vozi", "Misko");

		Autobus autobus1 = new Autobus("Krstic i Sin", 1000);
		System.out.println(autobus1);
		autobus1.dodatiVozaca(vozac1); // dodavanje vozaca autobusa
		autobus1.dodatiVozaca(vozac2); // provera ne moze da se doda jos jedan vozac

		System.out.println(autobus1);
		autobus1.uklonitiVozaca(); // ukloniti vozaca

		autobus1.dodatiPutnika(putnik1); // dodavanje putnika u autobus
		autobus1.dodatiPutnika(putnik2);
		autobus1.dodatiPutnika(putnik3);

		autobus1.uklonitiPutnika(putnik2); // ukloniti putnika

		autobus1.naplataKarte();// ne moze da se naplati karta bez vozaca
		System.out.println(autobus1);
		autobus1.dodatiVozaca(vozac1);

		autobus1.naplataKarte(); // posle dodatog vozaca moze naplata karte putnicima
		System.out.println(autobus1);
		putnik1.dodavanjeNovca(200);
		System.out.println(autobus1);

	}

}
