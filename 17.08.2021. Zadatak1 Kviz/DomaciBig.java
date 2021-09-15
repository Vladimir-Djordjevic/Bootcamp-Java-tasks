package Utorak;

import java.util.Scanner;

public class DomaciBig {

	public static void main(String[] args) {
		/*
		 * ZADATAK Napisati program koji oponasa kviz za pogadjanje glavnog grada. -
		 * Program treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz z
		 * programa. 1. Francuska 2. Italija 3. Srbija 4. Izlaz - Nakon odabira drzave,
		 * potrebno je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?' - Ako
		 * korisnik odgovori tacno, ispisuje se poruka 'Odgovor je tacan' - Ako korisnik
		 * odgovori netacno, ispisuje se poruka 'Odgovor nije tacan' - Nakon davanja
		 * odgovora (bilo da je tacan ili netacan), ponovo treba da se postave sve
		 * pocetne opcije i ponudi korisniku da odabere neku od njih. - Program se
		 * zavrsava kad korisni odabere 4. opciju 'Izlaz' - Program uraditi koriscenjem
		 * dosad naucenog + do-while petlje
		 */

		Scanner s = new Scanner(System.in);
		int izbor;
		String grad;

		do {
			System.out.print("1. Francuska \n2. Italija \n3. Srbija \n4. Izlaz \nIzberite broj: ");
			izbor = s.nextInt();
			s.nextLine();
			switch (izbor) {
			case 1:
				System.out.print("Koji je glavni grad drzave Francuske: ");
				grad = s.nextLine();
				grad = grad.trim();
				grad = grad.toUpperCase();
				if (grad.equalsIgnoreCase("Pariz")) {
					System.out.println("Odgovor je tacan !!");
				} else {
					System.out.println("Odgovor nije tacan !");
				}
				break;
			case 2:
				System.out.print("Koji je glavni grad drzave Italije: ");
				grad = s.nextLine();
				grad = grad.trim();
				grad = grad.toUpperCase();
				if (grad.equals("RIM")) {
					System.out.println("Odgovor je tacan !!");
				} else {
					System.out.println("Odgovor nije tacan !");
				}
				break;
			case 3:
				System.out.print("Koji je glavni grad drzave Srbije: ");
				grad = s.nextLine();
				grad = grad.trim();
				grad = grad.toUpperCase();
				if (grad.equals("BEOGRAD")) {
					System.out.println("Odgovor je tacan !!");
				} else {
					System.out.println("Odgovor nije tacan !");
				}
				break;
			case 4:
				System.out.println("Izabrali ste izlaz !!! ");
				break;
			default:
				System.out.println("Izaberite validnu opciju!!");
			}
		} while (izbor != 4);
		System.out.println("App end !");
		s.close();
	}

}
