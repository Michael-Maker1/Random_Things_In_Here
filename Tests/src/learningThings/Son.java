package learningThings;


class Father {
protected String surname;
protected String firstname;
protected String middlename;

 public	Father(String surname, String firstname ){
		this.surname= surname; 
		this.firstname  = firstname;
 }
	
		
		public String toString() {
			return  surname +" "+ firstname;
		}
	}


public class Son  extends Father{
	private String middlename;
	public  Son(String surname, String firstname , String middlename ){
		  super(surname, firstname) ;  
		  this.middlename = middlename;}
	
	public String toString() {
		return  super.toString() + " " + middlename;
	}

	public static void main(String[] args) {
		Father Init = new Father("Onwuka", "Nelson");
		System.out.println(Init);
		Son  Init1 =new Son ( "Onwuka", "Michael", "Ekene");
		System.out.println(Init1);

	}

}
