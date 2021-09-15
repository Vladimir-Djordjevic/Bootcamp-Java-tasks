package covek;

public class Vozac extends Covek {
//	Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).	
	
	
	private String zvanje;

public Vozac(String ime, String prezime) {
	super(ime, prezime);
	this.zvanje = "Sofer";
}
	
	
@Override
public String toString() {
	return "Vozac: " + super.getIme() + " " + super.getPrezime() + " - Zanimanje: " + zvanje;
}

}
