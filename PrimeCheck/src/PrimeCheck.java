import java.util.Scanner;

public class PrimeCheck {
	static boolean checkPrime(int num) {
		boolean flag = false;
		
		for(int i = 2; i <= num / 2; ++i) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		
		if(!flag)
			return true;
		else
			return false;
	}
	
	static void findFactors(int num) {
		System.out.println(num + " is not prime.");
		System.out.print("The factors of " + num + " are: ");
		for(int i = 1; i <= num; ++i) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int number;
		
		System.out.println("Enter an integer: ");
		number = in.nextInt();
		
		if(checkPrime(number) == true)
			System.out.println(number + " is prime.");
		else
			findFactors(number);
	}
}
