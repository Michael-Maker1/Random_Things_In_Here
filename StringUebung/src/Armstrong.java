import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);  
		System.out.print("Bitte geben Sie die untere Grenze an: ");	
	       int untereGrenze = scanner.nextInt();
	       System.out.print("Bitte geben Sie die obere Grenze an: ");
	       int obereGrenze = scanner.nextInt();
	         for( int z  =  untereGrenze; z <= obereGrenze ; z++)
	{			if( isArmstrong(z) == true ){
			    	System.out.println(z + " " + "ist eine Armstrongzahl!");}}}
			 
		 static boolean isArmstrong(int num ) {
			int sum = 0; int copyOfInput = num; int summe= 0;
			int sum1 =0; int sum2 = 0; int sum3 =0; int sum4 = 0; int sum5 = 0;int sum6 =0; int sum7 =0; 
		   	while (copyOfInput != 0) {
			int lastDigit = copyOfInput % 10; 
			sum += (lastDigit * lastDigit * lastDigit);
			summe +=(lastDigit*lastDigit*lastDigit*lastDigit);	
			sum1 +=(lastDigit*lastDigit*lastDigit*lastDigit*lastDigit);
sum1 +=(lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit);
sum2 += (lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit);
sum3 += (lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit);
sum4 += (lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit);
sum5 += (lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit);
sum6 += (lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit);
sum7 += (lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit*lastDigit);
copyOfInput = copyOfInput /10;}
		   	
		    if ( num > 0 && num < 10 ) {
		    	  return true; }
		if ((num== sum || summe == num || num == sum1 || num == sum2 || num == sum3 || num == sum4 || num ==sum5 || num == sum6 || num == sum7)  ) { 
	           return true; }   
	     
			return false;}

}

	


