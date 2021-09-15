package Metode;

import java.util.Scanner;

public class Domaci2 {

	public static void main(String[] args) {
		// Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
//		i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva.
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesi 1. broj: ");
		int a = s.nextInt();
		System.out.println("Unesi 2. broj: ");
		int b = s.nextInt();
		System.out.println("Unesi 3. broj: ");
		int c = s.nextInt();
		System.out.println("Proizvod unetih brojeva je: " +  proizvod(a,b,c));
		
			
		s.close();

	}
	public static int proizvod(int x1,int x2, int x3) {
		return x1 * x2 * x3;
	}

}
