package employeeimplementation;


public class Test {
		
	String s = "2001:0db8:0000:08d3:0000:8a2e:0070:7344";
	
	public static void kuerzeip(String ip) {
		String ausgabe="";
		String[] ipArray= new String[9];
		ipArray= ip.split(":", 8);
		
		for (String item : ipArray) {
			
				if(item.contains("0000")) {
					ausgabe+= item.replace("0000", "0")+ ":";
				} else if(item.startsWith("0")) {
					ausgabe+= item.replaceFirst("0", "") + ":";
				} else {
				ausgabe+= item + ":";
			}
			
		}
		System.out.println(ausgabe);
	}
}
