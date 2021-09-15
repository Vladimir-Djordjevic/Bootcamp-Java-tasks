package DomaciZooVrt;

import java.util.ArrayList;

public class Staniste {

	private String naziv;

	private ArrayList<Zivotinje> listaZivotinja = new ArrayList<>();

	public Staniste(String naziv) {

		this.naziv = naziv;

	}

	public void setListaZivotinja(Zivotinje zivotinja) {
		listaZivotinja.add(zivotinja);
	}

	public ArrayList<Zivotinje> getListaZivotinja() {
		return listaZivotinja;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void stampaj() {
		System.out.println("Naziv: " + naziv + "\nLista zivotinja koje zive u ovom stanistu:");
		for (Zivotinje zivotinja : listaZivotinja) {
			System.out.println(zivotinja.getNaziv());
		}

	}
}