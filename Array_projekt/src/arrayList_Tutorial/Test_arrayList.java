package arrayList_Tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_arrayList {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner scan= new Scanner(System.in);
		List<Integer> numList = new ArrayList<>();
		numList.add(11);
		numList.add(22);
		numList.add(33);
		System.out.println(numList);
		System.out.println(numList.get(1));
		numList.set(0, 1);
		System.out.println(numList);
		numList.remove(0);
		System.out.println(numList);
		numList.add(44);
		System.out.println(numList);
		
	}

}
