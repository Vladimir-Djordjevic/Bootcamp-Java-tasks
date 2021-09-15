package primer02;

import java.util.Scanner;

public class DomaciZadatak2 {

	public static void main(String[] args) {
		// Naci sumu parnih i sumu neparnih brojeva izmedju dva proizvoljno uneta broja
		Scanner s = new Scanner(System.in);
		System.out.print("Unesi neki broj:");
		int brojManji = s.nextInt();
		System.out.print("Unesi neki broj:");
		int brojVeci = s.nextInt();

		if (brojManji > brojVeci) {
			int tempBroj = brojManji;
			brojManji = brojVeci;
			brojVeci = tempBroj;
		}
		int iterator = brojManji + 1;
		int zbirParni = 0;
		int zbirNeParni = 0;
		while (iterator < brojVeci) {
			if (iterator % 2 == 0) {
				zbirParni += iterator;
			} else {
				zbirNeParni += iterator;
			}
			iterator++;
		}
		System.out.println("Zbir parnih brojeva: " + zbirParni);
		System.out.println("Zbir neparnih brojeva: " + zbirNeParni);

		s.close();
	}

}
