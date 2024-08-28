package kundenverwaltung;

public class Kundenverwaltung {
	private Kunde k1 = new Kunde();
	private Kunde k2 = new Kunde();
	
	private IKundenSpeicher iKundenSpeicher;
	
	public Kundenverwaltung(IKundenSpeicher kundenSpeicher) {
        this.iKundenSpeicher = kundenSpeicher;
    }
    
    // Oder alternativ eine Setter-Methode hinzufügen
    public void setKundenSpeicher(IKundenSpeicher ikundenSpeicher) {
        this.iKundenSpeicher = ikundenSpeicher;
    }
	
	public void aktualisiereAlleKunden() {
		 if (iKundenSpeicher == null) {
	            throw new IllegalStateException("KundenSpeicher wurde nicht initialisiert");
	        }
	        
	        if (k1 != null) {
	        	k1.set_Bezeichnung(IKundenSpeicher.BMW_KUNDE_BEZ);
	            iKundenSpeicher.aktuakisieren(k1);
	        }
	        if (k2 != null) {
	        	k2.set_Bezeichnung(IKundenSpeicher.VW_KUNDE_BEZ);
	            iKundenSpeicher.aktuakisieren(k2);
	        }
	}

}
