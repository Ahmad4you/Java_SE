package integerTools;  //#123

public class IntegerTools {
	public int numbers[];
	private int sum;
	public int numbers1[];
	public int numbers2[];
	
	public IntegerTools(int numbers[]) {
		this.numbers = numbers;   // this.numbers = from Class and not from parameter
	}
	public IntegerTools(int numbers1[], int numbers2[]) {
		this.numbers1 = numbers1;
		this.numbers2 = numbers2; // this = From Class
		
	}
	public int getsumArray() {
		for( int num : numbers) {
			sum += num;
		}
		return sum;
	}
	public int[] getAdditionTwoArrays() {      // to Add Tow Array we need an Arry int[]
		int numAdd[] = new int[numbers1.length];
		if(numbers1.length != numbers2.length) {
			System.out.println("The Tow Arrays not Equals");
			return numAdd;
		}else {
			
			for(int x = 0; x < numbers1.length; x++) {
				numAdd[x] = numbers1[x] + numbers2[x];
				
			}
		}
		return numAdd;	
	}
	

}
