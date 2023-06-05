import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numStudents = scanner.nextInt();
		scanner.nextLine();
		String[] students = new String[numStudents];
		int[] age = new int[numStudents];
		for(int i=0; i<numStudents; i++) {
			System.out.println("Enter the student's name: ");
			students[i] = scanner.nextLine();
			System.out.println("What age is this student?");
			age[i] = scanner.nextInt();
			scanner.nextLine();
		}
		
		for(int i=0; i<numStudents; i++) {
			if(age[i] >= 15) {
				System.out.println(students[i] + " can receive a vaccine");
				System.out.println(students[i] + " is now " + age[i] + " years old");
			}
		}
		scanner.close();
		
	}

}
