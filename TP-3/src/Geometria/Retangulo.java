package Geometria;

public class Retangulo extends Quadrilateros implements FormaGeometrica {

	public Retangulo(double a, double b) {
		super(a, b);
		
	}

	@Override
	public double calculoArea() {
		double areaR = (a)*(b);
		return areaR;
		
	}

	

	

	
}
