package assoziation_composition;

public class Reifen {

	private double durchmesser;
	private double profiltiefe;
	private String jahreszeit;

	// Kontruktor
	public Reifen(double pDurchmesser, double pProfiltiefe, String pJahreszeit) {
		durchmesser = pDurchmesser;
		profiltiefe = pProfiltiefe;
		jahreszeit = pJahreszeit;
	}

	// Ausgabe
	public void schreibeInfo() {
		System.out.println("Durchmesser: " + durchmesser);
		System.out.println("Profiltiefe: " + profiltiefe);
		System.out.println("Jahreszeit:  " + jahreszeit);
	}

	// Umwandlung in String
	public String toString() {
		return jahreszeit + "reifen mit " + durchmesser + " cm Durchmesser und " + profiltiefe + " Profiltiefe";
	}

	// get-Methoden
	public double getDurchmesser() {
		return durchmesser;
	}

	public double getProfiltiefe() {
		return profiltiefe;
	}

	public String getJahreszeit() {
		return jahreszeit;
	}

}
