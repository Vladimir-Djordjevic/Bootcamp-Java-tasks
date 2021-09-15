package DomaciZooVrt;

public class MainZoo {

	public static void main(String[] args) {

		Sisari majmun = new Sisari("Kicmenjaci", "Majmun", "Banane", "Crna", "Svastojed", "Divlja zivotinja");

		majmun.stampaj(); // jedan sisar stampa

		majmun.setCovekovaPodela("Domaca zivotinja"); // zamena uloge

		System.out.println("------------------------");

		majmun.stampaj(); // posle izmene stampa

		System.out.println("------------------------");

		Ribe pirana = new Ribe("Kicmenjaci", "Pirana", "Mesojed", "Slana voda", 4, "neka vrsta");
		pirana.stampaj(); // jedna riba

		System.out.println("------------------------");

		Staniste bara = new Staniste("Bara");

		bara.setListaZivotinja(majmun);
		bara.setListaZivotinja(pirana);

		bara.stampaj(); // jedno staniste sa listom ?

	}

}
