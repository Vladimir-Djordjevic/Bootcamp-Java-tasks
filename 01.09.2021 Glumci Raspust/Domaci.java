package raspustDomaci;

public class Domaci {

	public static void main(String[] args) {

		Glumci glumac1 = new Glumci("Christian Bale", 1974, "Muski", true, 1500000, 47);

		glumac1.setFimovi(8.1, "Ford v Ferrari");
		glumac1.setFimovi(7.2, "Vice");
		glumac1.setFimovi(6.5, "Mowgli: Legend of the Jungle");
		glumac1.setFimovi(7.2, "Hostiles");
		glumac1.setFimovi(6.0, "The Promise");

		glumac1.display();

		System.out.println("===========================");
		Glumci glumac2 = new Glumci("Emily Blunt", 1983, "Zenski", true, 890000, 40);

		glumac2.setFimovi(6.6, "Jungle Cruise");
		glumac2.setFimovi(5.7, "Wild Mountain Thyme");
		glumac2.setFimovi(7.3, "A Quiet Place Part II");
		glumac2.setFimovi(6.7, "Mary Poppins Returns");
		glumac2.setFimovi(5.2, "Sherlock Gnomes");

		glumac2.display();

	}
}
