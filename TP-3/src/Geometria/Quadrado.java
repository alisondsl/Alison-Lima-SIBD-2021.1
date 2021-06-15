package Geometria;

public class Quadrado extends Quadrilateros implements FormaGeometrica {

	public Quadrado(double a) {
		super(a, a);
		
	}

	@Override
	public double calculoArea() {
		double areaQ = Math.pow(a, 2);
		return areaQ;
	}

	
	

}
