package assoziation_composition;

public class Motor {
	
	 private int leistung;
	  private double hubraum;
	  
	  // Konstruktor
	  public Motor(int pLeistung, double pHubraum){
	    leistung = pLeistung;
	    hubraum = pHubraum;
	  }
	  
	  // Ausgabe
	  public void schreibeInfo(){
	    System.out.println("Leistung: "+leistung);
	    System.out.println("Hubraum:  "+hubraum);
	  }
	  
	  // Umwandlung in String:
	  public String toString() {
	    return "Motor mit " + leistung + " PS und " + hubraum + " Liter Hubraum";
	  }
	  
	  // get-Methoden
	  public int getLeistung(){
	    return leistung;
	  }
	  public double getHubraum(){
		
	    return hubraum;
	  }

}
