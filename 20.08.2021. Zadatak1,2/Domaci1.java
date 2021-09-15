package Nizovi;

public class Domaci1 {

	public static void main(String[] args) {
		// -Napisati program gde u nizu napisete 5 gradova, a program vam odstampa sve osim prvog i poslednjeg unosa.
		

		
		
		String[] gradovi = {"Beograd" , "Rim" , "Pariz" , "Lisabon", "London"};
		
		for(int i =1; i < gradovi.length -1 ; i++ ) {
			System.out.println( gradovi[i]);
		}
		
//		-Napisati program gde u nizu napisete ovih 5 gradova (Lisabon, London, Helsinki, Prag i Madrid) a program
//		stampa gradove sve dok ne dodje do "Prag"-a
		

		String[] gradovi2 = {"Lisabon", "London", "Helsinki", "Prag" , "Madrid"};
		for(String s : gradovi2) {
			if (!s.equals("Prag")){
			System.out.println(s);
				
			}else {
				break;
			}
		
		}

	}

}
