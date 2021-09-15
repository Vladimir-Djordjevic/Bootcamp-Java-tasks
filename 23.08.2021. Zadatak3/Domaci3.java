package Metode;

import java.util.Scanner;

public class Domaci3 {

	public static void main(String[] args) {
		// DodatniFunkcije3: -> spojena prva dva zadatka sa malo izmenjenim zahtevima ->
//		Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva i ispisuje dve metode.
//		Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih brojeva.
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesi 1. broj: ");
		int a = s.nextInt();
		System.out.println("Unesi 2. broj: ");
		int b = s.nextInt();
		System.out.println("Unesi 3. broj: ");
		int c = s.nextInt();
		System.out.println("Proizvod unetih brojeva je: " +  zbir(a,b,c));
		System.out.println("Najveci broj od unetih brojeva je: " +  najveci(a,b,c));
		s.close();
	}
	public static int zbir(int x1,int x2, int x3) {
		return x1 + x2 + x3;
	}
	public static int najveci(int x1,int x2, int x3) {
		int max =Integer.MIN_VALUE;
		if(max < x1) {
			max =x1;
		}
		if(max < x2) {
			max =x2;
		}
		if(max < x3) {
			max =x3;
		}
		return max;
	}


}
