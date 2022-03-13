import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		//for e.g. num = 121
		int length = String.valueOf(num).length();
		int a=0;
		int temp = num;
		for(int i=1; i<=length; i++) {
			
			a = 10*a + temp%10;
			int b = temp/10;
			temp = b;
		}
		
		if(num==a) {
			
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}
		
		

	}

}
