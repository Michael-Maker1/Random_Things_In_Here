
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);  
		System.out.print("Bitte geben Sie die untere Grenze an:");	
	       int eingeben1 = scanner.nextInt();
	       System.out.print("Bitte geben Sie die obere Grenze an:");
	       int eingeben2 = scanner.nextInt();
	         for( int i  =  eingeben1; i <= eingeben2 ; i++)
	{			if( isArmstrong(i) == true ){
			    	System.out.println(i + " "+ " ist eine Armstrongzahl!");}}}
			 
		public static boolean isArmstrong(int number)
			{ int sum = 0;   int count = 0; int cnt ; int rem =0; 
			int mul=1;int copyOfInput = number; int justChecking = number;
			
			
		   	while (number != 0) {
		   	 number = number /10;
		          count++;	}
		
		   	number = number;
		 	cnt = count ;
		 	
		 	 
		   	while (copyOfInput != 0 ) {// this is meant not be zero
		   	rem = copyOfInput % 10;
		   	
		   		while ( cnt != 0) {
		   		mul = rem*mul; // 
		   		cnt--;} // Decreases n times depending on the inputed number...
		   		
		   		sum += mul;
		   		mul = 1;
		   		copyOfInput = copyOfInput / 10 ; //number is meant to be 15 here 
		   		cnt = count ; // 
		   		}	
		   	
		   	
		if (sum == justChecking ) {  //number and copyOfInput are both zeros
	           return true; } 
		else {
			return false;  
		}
	}

}

