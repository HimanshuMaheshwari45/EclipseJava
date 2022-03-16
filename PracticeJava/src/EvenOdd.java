import java.util.Scanner;

public class EvenOdd {
	
	public boolean M1(int number) {
	
		if (number%2==0) {
			return true;
			
		}
		else {
			return false;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		EvenOdd obj =new EvenOdd();
		System.out.println(obj.M1(num));	

	}

}
