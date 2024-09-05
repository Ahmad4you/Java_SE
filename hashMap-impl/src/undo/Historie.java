package undo;

import java.util.ArrayDeque;
import java.util.Deque;

public class Historie {
	private Deque<String> historie = new ArrayDeque<String>();
	
	public String zurueck() {
		String letzterSchritt = historie.peekFirst();
		
		// Pruefung ob zuvor ein Schritt getätigt wurde -> rückgängig gemacht
		if (letzterSchritt != null) historie.removeFirst();
			
		return letzterSchritt;
	}
	
	public void weiter(String s) {
		historie.addFirst(s);
	}

}
