import java.util.Scanner;

public class PasswordComplexity {

	public boolean com_pass(String str){
        int upper_case=0;
        int lower_case=0;

        int str_len = str.length();
        if (str_len<6){
            return false;
        }
        int intCount = 0;
        for(int i = 0; i<str_len; i++){
            if(Character.isDigit(str.charAt(i))) {
                intCount++;
            }
            if (Character.isUpperCase(str.charAt(i))){
                upper_case++;
            }
            if (Character.isLowerCase(str.charAt(i))){
                lower_case++;
            }

        }
        if((intCount>=1)&&(upper_case>=1)&&(lower_case>=1)){
            return true;
        }
        else{
            return false;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        PasswordComplexity obj = new PasswordComplexity();
        System.out.println(obj.com_pass(str));


	}

}
