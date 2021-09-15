package Metode;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		// Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog
		// ulaza (znaci da korisnik unosi tri broja)
//		   i taj program treba da pozove i ispise (u mainu) najmanji od ta tri unesena broja.

		Scanner s = new Scanner(System.in);
		int[] brojevi = new int[3];
		for (int i = 0; i < brojevi.length; i++) {
			System.out.print("Unesi broj: ");
			brojevi[i] = s.nextInt();
		}

		System.out.println("Najmanji broj je: " + najmanjiTri(brojevi));
		s.close();
	}

	public static int najmanjiTri(int... x) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < x.length; i++) {
			if (x[i] < min) {
				min = x[i];
			}
		}
		return min;

	}

}
