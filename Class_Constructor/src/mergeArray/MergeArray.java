package mergeArray;

public class MergeArray {
	
	public Object[] array1;
	public Object[] array2;
	
	public MergeArray(Object[] array1, Object[] array2) {
		this.array1 = array1;
		this.array2 = array2;
		
	}
	public Object[] mergeTwoArrays() {
		int a1 = array1.length;
		int a2 = array2.length;
		Object[] arrayResult = new Object[a1 + a2];
		System.arraycopy(array1, 0, arrayResult, 0, a1);
		System.arraycopy(array2, 0, arrayResult, a1, a2);
		
		return arrayResult;
	}

}
