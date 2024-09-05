package kundenverwaltung;

public interface IKundenSpeicher {
	public static final String BMW_KUNDE_BEZ="BMW";
	public static final String VW_KUNDE_BEZ="VW";
	
	public void newKunde(Kunde k);
	public Kunde laden(int kundeNr);
	public void aktuakisieren(Kunde k);
	public void loeschen(int kundeNr);
	

}
