package learningThings;

class Punkt {
    protected int x, y; // nicht von außen nutzbar, wird aber vererbt!

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("x = %d, y = %d", x, y);
    }
}

public class FarbigerPunkt extends Punkt {
	private String farbe;
	
	public FarbigerPunkt(int x, int y, String farbe) {
		super(x, y); // Oberklassen-Attribute initialisieren
		this.farbe = farbe;
	}
	
	public String toString() {
		return super.toString() + ", farbe = " + farbe;
		//return "x = " + x + ", y = " + y + ", farbe = " + farbe;
	}
	
	
	public static void main(String[] args) {
		Punkt p0 = new Punkt(10, 3);
        System.out.println(p0);
		FarbigerPunkt p1 = new FarbigerPunkt(10, 3, "rot");
        System.out.println(p1);
	}

}



	
		