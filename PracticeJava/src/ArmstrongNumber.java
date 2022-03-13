import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		
		// for e.g. Number is 153.
		int len = String.valueOf(num).length();
		int x = num;
		int sum = 0;
		for(int i=1;i<=len;i++){
			
			
			int a = x%10;
			x = x/10;
			
			sum = (int) (sum + Math.pow(a, 3)); 
		
		}
		
		if(sum==num) {
			
			System.out.println("Number " + num + " is Armstrong");	
		}
		
		else {
			System.out.println("Number " + num + " is not Armstrong");
			
		}
		
	}

}
