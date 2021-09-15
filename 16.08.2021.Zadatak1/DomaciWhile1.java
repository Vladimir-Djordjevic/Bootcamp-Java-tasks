package primer02;

import java.util.Scanner;

public class DomaciWhile1 {

	public static void main(String[] args) {

//		While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
//		primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11	

		Scanner s = new Scanner(System.in);
		System.out.print("Unesi broj: ");

		int broj = s.nextInt();
		int zbir = 0;
		while (broj >= 0) {
			zbir += broj;
			System.out.print("Unesi broj: ");
			broj = s.nextInt();
		}
		System.out.println("Zbir unetih brojeva je: " + zbir);
		s.close();

	}

}
