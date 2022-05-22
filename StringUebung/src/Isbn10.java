import java.util.Scanner;
import isbn10.Isbn10StatusCodes;

public class Isbn10 {
	static int validityIsbn10(String isbn) {    
	     
	     isbn = isbn.replace("-", "");
	     isbn = isbn.replace(" ", "");
	     int sum =0;    
	      try {
	         char ch = isbn.charAt(9);
	         ch = Character.toUpperCase(ch);
	         if( ch != 'X') {
	            // don't store, only check
	            Long.parseLong(isbn); }
	      } catch(NumberFormatException nfe) {
	  	  return Isbn10StatusCodes.FALSCHES_ZEICHEN;}
	   
	      catch(IndexOutOfBoundsException e) {
	    	  return Isbn10StatusCodes.FALSCHE_LAENGE;
	     }
	      
//	      int n = isbn.length();
//	      if( n != 10) {
//	    	  return Isbn10StatusCodes.FALSCHE_LAENGE;	  
//	      }
//	      
	  for( int i= 0; i < 9 ; i++) {
		  int digit = isbn.charAt(i)-'0';
		  if ( 0 > digit ||  9<digit) {
			  return Isbn10StatusCodes.FALSCHES_ZEICHEN;} 
			  sum += (digit *(10-i));	  }
	  char last = isbn.charAt(9);
	  
      if (last != 'X' && (last < '0' ||last > '9'))
          return Isbn10StatusCodes.FALSCHES_ZEICHEN;

      // If last digit is 'X', add 10
      // to sum, else add its value
      sum += ((last == 'X') ? 10 : (last - '0'));
      
      if(sum % 11 == 0) {
		   return Isbn10StatusCodes.OK;
      }
      else {
    	  return Isbn10StatusCodes.FALSCHE_PRUEFSUMME;
    	  }
		}	
	
	public static void main(String[] args) {
		System.out.print("ISBN eingeben: ");
		Scanner scanner = new Scanner(System.in);
		String isbn = scanner.nextLine();
		scanner.close();
      	switch (validityIsbn10(isbn)) {
      	
    	case  Isbn10StatusCodes.FALSCHES_ZEICHEN :
			System.out.println("Fehler: Keine Ziffer");
			break;
		case  Isbn10StatusCodes.FALSCHE_LAENGE :
			System.out.println("Fehler: Falsche Laenge");
			break;
		case Isbn10StatusCodes.FALSCHE_PRUEFSUMME:   
			System.out.println("Felher: Falsche Pruefsumme");
			break;
		case Isbn10StatusCodes.OK:
			System.out.println("OK");
			break;
			}
		}
		
		}
