package learningThings;


	abstract class GeometrischesObjekt {
		private String bezeichnung;	
		
		public GeometrischesObjekt(String bezeichnung) {
			this.bezeichnung = bezeichnung;
		}
		
		abstract public double berechneUmfang() ;
		
	}

	class Quadrat2 extends GeometrischesObjekt {
		private double a;

		public Quadrat2(String bezeichnung, double a) {
			super(bezeichnung);
			this.a = a;
		}

		public double berechneUmfang() {
			return 4 * a;
		}
		
	}

	class Kreis extends GeometrischesObjekt {
		private double radius;
		
		public Kreis(String bezeichnung, double radius) {
			super(bezeichnung);
			this.radius = radius;
		}

		
		@Override
		public double berechneUmfang() {
			return 2 * radius * Math.PI;
		}
	}

	class Dreieck extends GeometrischesObjekt{
		private double a, b, c;

		public Dreieck(String bezeichnung, double a, double b, double c) {
			super(bezeichnung);
			this.a = a;
			this.b = b;
			this.c = c;
		}

		@Override
		public double berechneUmfang() {
			return a + b + c;
		}
		
	}

	class Rechteck extends GeometrischesObjekt {
		private double a, b;

		public Rechteck(String bezeichnung, double a, double b) {
			super(bezeichnung);
			this.a = a;
			this.b = b;
		}

		@Override
		public double berechneUmfang() {
			return 2 * (a + b);
		}
		
	}

	public class GeometrischesObjektDemo {

		public static void main(String[] args) {
			// Substitutionsprinzip
			// An Stellen, wo eine Oberklassenreferenz verlangt wird, kann auch eine Unterklassenreferenz stehen!
			// 
			GeometrischesObjekt[] objekte = {
					new Quadrat2("Quadrat 1", 3.0), // ist ein Quadrat
					new Kreis("Kreis 1", 2.5),   // ist ein Kreis
					new Dreieck("Dreieck 1", 1.0, 2.0, 3.0),  // ist ein Dreieck
					new Rechteck("Rechteck 1", 2.0, 3.0)
			};
			
					
			for (GeometrischesObjekt go : objekte) {
				System.out.println("Umfang: " + go.berechneUmfang());
			}
		}

	}




