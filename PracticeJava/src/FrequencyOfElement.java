import java.util.Scanner;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] {1,2,6,7,9,8,2,7,2,1,4,2,6,5,9,1};
		int[] visitedArr = new int[arr.length];
		int visited = -1;
		//int count = 1;
		
		for (int i=0; i<arr.length; i++) {
			int count = 1;
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					count++;
					visitedArr[j] = visited;
				}
				
			}
			
			if(visitedArr[i]!=visited) {
				visitedArr[i]=count;
			}
		
		}
		
		for(int i=0; i<visitedArr.length; i++) {
			if (visitedArr[i]!=visited) {
				System.out.println("Frequency of " + arr[i]+ " -> " + visitedArr[i]);
			}	
			
		}

	}

}