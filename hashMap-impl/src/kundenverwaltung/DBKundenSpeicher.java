package kundenverwaltung;

public class DBKundenSpeicher implements IKundenSpeicher{

	@Override
	public void newKunde(Kunde k) {
		// TODO Auto-generated method stub
		System.out.println("new Kunde");
	}

	@Override
	public Kunde laden(int kundeNr) {
		// TODO Auto-generated method stub
		System.out.println("laden");
		return null;
	}

	@Override
	public void aktuakisieren(Kunde k) {
		// TODO Auto-generated method stub
		System.out.println("aktualisiern: " + k.get_Bezeichnung());
	}

	@Override
	public void loeschen(int kundeNr) {
		// TODO Auto-generated method stub
		System.out.println("Löschen");
	}

}
