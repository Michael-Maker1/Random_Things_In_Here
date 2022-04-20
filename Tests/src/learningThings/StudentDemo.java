package learningThings;


class Person {
	protected String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

//	public String getName() {
////		return name;
//	}
}

class Student extends Person {
	private int matrikelnummer;

	public Student(String name, int matrikelnummer) {
		super(name);
		this.matrikelnummer = matrikelnummer;
		super.name += "!";
	}

//	public int getMatrikelnummer() {
//		return matrikelnummer;
//	}

	@Override
	public String toString() {
		return "Student [matrikelnummer=" + matrikelnummer + ", toString()=" + super.toString() + "]";
	}

	
}

public class StudentDemo {

	public static void main(String[] args) {
		Student paula = new Student("Paula", 1234);
		System.out.println(paula);
	}

}


