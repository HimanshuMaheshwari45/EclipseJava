//import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Scanner;

public class WaterBill {

	public double calculateWaterBill(double gallonsUsage) {
		 Currency c = Currency.getInstance("USD");
		 
		 
		double minimumWaterBill = 18.84;
		double numberOfGallonsInCCF = 748;
		double includedGallons = 2*numberOfGallonsInCCF;
		
		double extraGallonUsed = gallonsUsage - includedGallons;
		
		double extraBill = Math.ceil(extraGallonUsed/numberOfGallonsInCCF)*3.90;
		//DecimalFormat df = new DecimalFormat("0.00");
		
		if (gallonsUsage<=includedGallons) {
			return minimumWaterBill;
			
		}
		else {
			return minimumWaterBill+extraBill;
			//return Double.parseDouble(df.format(waterBill+extraBill));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many gallons of water " + "did you use this month?");
		double usage = sc.nextDouble();	
		
		WaterBill Bill = new WaterBill();
		
		System.out.println("your water bill is: " + Bill.calculateWaterBill(usage));

	}

}
