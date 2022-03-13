import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean flag =true;
		if(num<0) {
			System.out.println("Enter valid number");
		}
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
			
		}
		if(flag) {
			System.out.println("number is Prime");
		}
		else {
			System.out.println("number is not Prime");
		}
		
		
		
	}

}
