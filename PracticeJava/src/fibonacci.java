public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int count = 10;
		int n3;
		
		//0,1,1,2,3,5,8,13.......
		System.out.println(n1+ "\n"+ n2);
		
		for(int i=1; i<=count; i++) {
			
			n3= n1+n2;
			System.out.println(n3);
			
			n1=n2;
			n2=n3;		
			
		}

	}

}