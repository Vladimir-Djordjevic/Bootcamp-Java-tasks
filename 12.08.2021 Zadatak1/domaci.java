package primer01;

import java.util.Scanner;

public class domaci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ime = "Vladimir";
		String prezime  = "Djordjevic";
		char pol = 'm';
		System.out.println("Ime:" + ime + ", Prezime:" + prezime + ", pol:" + pol );	
	
		System.out.print("Ukupan broj medalja: ");
		int ukupanBrojMedalja = s.nextInt();
		System.out.print("Ukupan broj  zlatnih medalja: ");
		int ukupanBrojZlatinhMedalja = s.nextInt();
		double odnosZlatnih = (double)ukupanBrojZlatinhMedalja / ukupanBrojMedalja * 100 ;
		
		System.out.println("Procenat zlatnih medalja u odnosu na ukupan broj medalja je: " + odnosZlatnih + "%");
		
		s.close();

	}

}
