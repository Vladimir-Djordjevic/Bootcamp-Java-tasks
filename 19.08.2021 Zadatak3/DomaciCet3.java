package Cet;

import java.util.Scanner;

public class DomaciCet3 {

	public static void main(String[] args) {
		/*-Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik preko skenera.
		(Koristiti for petlju)
		Na primer N: 5
		*
		**
		***
		****
		*****  */

		Scanner s = new Scanner(System.in);
		System.out.print("Unesite neki broj: ");
		int n = s.nextInt();
		String zvezda = "";
		for (int i = 0; i < n; i++) {
			zvezda += '*';
			System.out.println(zvezda);

		}
		s.close();
	}

}
