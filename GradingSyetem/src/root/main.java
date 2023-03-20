package root;

import java.util.Scanner;

public class main {
	public static void main (String []args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Mark = ");
		
		int mark = input.nextInt();
		
		if(mark >= 90 && mark < 100) {
			System.out.println(" Result = A+ ");
		}
		else if(mark >= 80 && mark < 89) {
			System.out.println(" Result = A ");
		}
		else if(mark >= 70 && mark < 79) {
			System.out.println(" Result = B+ ");
		}
		else if(mark >= 60 && mark < 69) {
			System.out.println(" Result = B ");
		}
		else if(mark >= 50 && mark < 59) {
			System.out.println(" Result = C ");
		}
		else if(mark >= 40 && mark < 49) {
			System.out.println(" Result = D ");
		}else if(mark >= 0 && mark < 39 ){
			System.out.println(" Result = F ");
		}else {
			System.out.println("Invalid Number");
		}
	}
}
