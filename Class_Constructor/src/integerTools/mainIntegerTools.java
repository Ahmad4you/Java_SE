package integerTools;

public class mainIntegerTools {

	public static void main(String[] args) {
//		int nums[] = {5, 4, 9};
//		int nums1[] = {1, 2, 3};
//		IntegerTools i = new IntegerTools(nums);
//		IntegerTools ii = new IntegerTools(nums1);
//		System.out.println("sumArray: " + i.getsumArray());
//		System.out.println("sumArray: " + ii.getsumArray());
		int nums1[] = {5, 4, 3, 2};
		int nums2[] = {10, 5, 8, 7};
		int result[];
		IntegerTools i = new IntegerTools(nums1, nums2);
		result = i.getAdditionTwoArrays();
		for( int num : result) {
			System.out.println(num);
		}
		
	}

}
