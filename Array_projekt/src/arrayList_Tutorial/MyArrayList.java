package arrayList_Tutorial;

public class MyArrayList {

	public static void main(String[] args) {
		java.util.List<String> nameList = new java.util.ArrayList<String>();
		nameList.add("Ahmad");
		nameList.add("Omar");
		nameList.add("Diana");
		System.out.println(nameList);
		System.out.println(nameList.get(0));
		System.out.println(nameList.get(2));
		nameList.add("Bana");
		System.out.println(nameList);
		nameList.remove(3);
		System.out.println(nameList);
		nameList.add("Leen");
		System.out.println(nameList);
		nameList.set(3, "Salwa");
		System.out.println(nameList);

	}

}
