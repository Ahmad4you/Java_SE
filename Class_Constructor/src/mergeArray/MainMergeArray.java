package mergeArray;

public class MainMergeArray {

	public static void main(String[] args) {
		Object[] obj1 = {"Ahmad", "Diana", "Leen"};
		Object[] obj2 = {'A', 'B', 5, true, 1.5};
		Object[] objResult;
				
		MergeArray m = new MergeArray(obj1, obj2);
		objResult = m.mergeTwoArrays();
		for(Object o : objResult) {
			System.out.println(o);
		}
	}

}
