
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first Number ");
		int a = sc.nextInt();
		
		System.out.println("Enter your second Number ");
		int b = sc.nextInt();
		
		System.out.println("Enter the operation ");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		int result = 0;
		
		switch(operation) {
		case '+':
			result = a+b;
			break;
		case '-':
		    result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			result = a/b;
			break;
		default:
			System.out.println("Invalid Operation");
		}
		
		System.out.println("The result is "+ result+'.');
		
				

	}

}
