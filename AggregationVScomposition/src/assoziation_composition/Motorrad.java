package assoziation_composition;

public class Motorrad {

	private Motor meinMotor;
	private Reifen[] meineReifen;  // ich brauche 2 Reifen

	
	public Motorrad(Motor pMotor, Reifen pVorne, Reifen pHinten) {
		meinMotor = pMotor; // Assoziation

		meineReifen = new Reifen[2];  // Assoziation 
		meineReifen[0] = pVorne;
		meineReifen[1] = pHinten;
	}

	// Ausgabe
	public void schreibeInfo() {
		System.out.println("Motor:-->");
		meinMotor.schreibeInfo();
		System.out.println("Reifen:-->");
		for (int i = 0; i < meineReifen.length; i = i + 1) {
			meineReifen[i].schreibeInfo();
		}
	}

	// Umwandlung in String:
	public String toString() {
		return "Motorrad mit einem " + meinMotor + " und vorne einem " + getVorderreifen() + " und hinten einem "
				+ getHinterreifen();
	}

	// get-Methoden
	public Reifen getVorderreifen() {
		return meineReifen[0];
	}

	public Reifen getHinterreifen() {
		return meineReifen[1];
	}

	public Motor getMotor() {
		return meinMotor;
	}
}
