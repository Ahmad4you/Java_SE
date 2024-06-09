package array_exemple1;

public class ArrayExemple1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		java.util.Scanner s = new java.util.Scanner(System.in);
		String names[] = new String[5];
		int grades[] = new int[5];

		for (int x = 0; x < names.length; x++) {
			System.out.println("Enter the Name of Student Number " + String.valueOf(x + 1) + ": ");
			names[x] = s.next();
			System.out.println("Enter Student Grades Number" + String.valueOf(x + 1) + ": ");
			grades[x] = s.nextInt();
		}
		for (int x = 0; x < grades.length; x++) {
			System.out.println("Student Name" + String.valueOf(x + 1) + " " + names[x] + "; Grade: " + grades[x]);
		}

	}

}
