package enhanced_for;

import java.util.List;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		List<String> nameList= new ArrayList<>();
		nameList.add("Ahmad");
		nameList.add("Leen");
		nameList.add("Diana");
		
		for(String str: nameList) {
			System.out.println(str);
		}
		
	}

}
