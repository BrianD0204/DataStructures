package src;
import java.util.Scanner;
public class Factorial {
	public static int fact(int n){
		if(n==1)
			return 1;
		else
			return n * fact(n-1);
		
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer ");
		int n = scan.nextInt();
		
		System.out.println("The factorial of "+ n+ " is " + fact(n));
	}
}
