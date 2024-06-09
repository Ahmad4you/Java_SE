package enhanced_for;

import java.util.ArrayList;
import java.util.List;

public class MyForeach {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Ahmad");
		nameList.add("Omar");
		nameList.add("Diana");
		
		for(String str : nameList) {
			System.out.println(str);
		}
		
		int nums[] = new int[5];
		nums[0]= 10;
		nums[1]= 20;
		nums[2]= 30;
		for(int i : nums) {
			System.out.println(i);
		}
	}

}
