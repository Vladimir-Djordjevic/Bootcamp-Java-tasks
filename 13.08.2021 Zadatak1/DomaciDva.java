package primer01;

import java.util.Scanner;

public class DomaciDva {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Unesite broj: ");
		double broj = s.nextDouble();

		if (broj < 10) {
			broj *= 100;
			System.out.println("Broj je pomnozen sa 100: " + "Rezultat: " + broj);
		} else if (broj > 100) {
			broj = broj / 10;
			System.out.println("Broj je podeljen sa 10: Rezultat: " + broj);
		} else {
			System.out.println("Broj nije manji od 10 ili veci od 100  Rezultat: " + broj);
		}
		s.close();

		/*
		 * Upisao sam broj 9,Rezultat: 900.0 ; Upisao sam broj 10,Rezultat: 10.0 ;
		 * Upisao sam broj 100, Rezultat: 100.0; Upisao sam broj 101, Rezultat: 10.1
		 */

	}

}
