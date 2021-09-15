package Cet;

import java.util.Scanner;

public class DomaciCet1 {

	public static void main(String[] args) {
		/*
		 * -Napisati program gde korisnik unosi pozitivne brojeve, kad unese negativan
		 * broj prikaze mu se suma svih prethodno unetih brojeva i na kraju
		 * zakomentarisati koje ste brojeve sve unosili po testu na primer: //test 1 x,
		 * y, z //test 2 x, y, z //test 3 x, y, z (Koristiti do while petlju)
		 */

		Scanner s = new Scanner(System.in);
		int suma = 0;
		int broj;
		do {
			System.out.print("Unesite broj: ");
			broj = s.nextInt();
			if (broj >= 0) {
				suma += broj;
			}

		} while (broj >= 0);
		System.out.println("Suma unetih brojeva: " + suma);
		s.close();

		/*
		 * Brojevi koriscenji za testiranje: test 1: 0 , 1 , -1 Suma dobijena: 1 test 2:
		 * 10 ,50 ,100 ,-5 Suma dobijena: 160 test 3: -1 Suma dobijena : 0 test 4: 100
		 * ,50 , -10 Suma dobijena: 150
		 */

	}

}
