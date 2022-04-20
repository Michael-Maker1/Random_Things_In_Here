package learningThings;

public class Person2 {


		// TODO Auto-generated method stub
		 private String name;
		    private int age;
		    private int weight;
		    private int height;
          
            
		    public Person2(String name) {
		    	this(name,0,0,0);
		    }

		    public Person2(String name, int age, int height, int weight) {
		        this.name = name;
		        this.age = age;
		        this.weight = weight;
		        this.height = height;
		    }

		    // other constructors and methods

		    public String getName() {
		        return this.name;
		    }

		    public int getAge() {
		        return this.age;
		    }

		    public int getHeight() {
		        return this.height;
		    }

		    public void growOlder() {
		        this.age = this.age + 1;
		    }

		    public void setHeight(int newHeight) {
		        this.height = newHeight;
		    }

		    public void setWeight(int newWeight) {
		        this.weight = newWeight;
		    }

		    public double bodyMassIndex() {
		        double heightPerHundred = this.height / 100.0;
		        return this.weight / (heightPerHundred * heightPerHundred);
		    }

		    @Override
		    public String toString() {
		        return this.name + ", age " + this.age + " years";	}
		    
		    
		    public static void main(String[] args) {
		    	Person2 joan = new Person2("John Ball");
		    	System.out.println(joan);
		    	
		    	Person2 ball = joan;
		    	ball.growOlder();
		    	ball.growOlder();
		    	
		    	System.out.println(joan);
}}
