package assoziation1;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		
		List<Schueler> schuelers = new ArrayList<Schueler>();
		
		schuelers.add(new Schueler(1, "Al_Ibrahim", "Sami", "1er"));
		schuelers.add(new Schueler(2, "Al_Ibrahim", "Sali", "1er"));
		schuelers.add(new Schueler(3, "Al_Ibrahim", "Ahmad", "2er"));
		schuelers.add(new Schueler(4, "Al_Ibrahim", "Tobi", "2er"));
		
		
		Lehrer gc= new Lehrer(11, "GC", "Stefan", "SAE");
		gc.set_SchuelerList(schuelers);
		
		System.out.println(gc.get_SchuelerList());
		
		System.out.println();
		System.out.println();
		 
		for (Schueler schueler : gc.get_SchuelerList()) {
			System.out.println(schueler);
		}
	}

}
