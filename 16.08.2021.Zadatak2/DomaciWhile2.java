package primer02;

import java.util.Scanner;

public class DomaciWhile2 {

	public static void main(String[] args) {

//		While2: Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!” onoliko puta koliko je korisnik zadao preko konzole.
//		Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta  
		Scanner s = new Scanner(System.in);
		System.out.print("Unesi te broj: ");
		int broj = s.nextInt();
		int i = 0;
		String lakuNoc = "";
		while (i < broj) {
			lakuNoc = lakuNoc.concat("Laku noc !");
			i++;
		}

		System.out.println(lakuNoc);
		s.close();

	}

}
