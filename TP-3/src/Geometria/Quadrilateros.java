package Geometria;

public abstract class Quadrilateros implements FormaGeometrica{

	public double a, b, c, d;

	public Quadrilateros(double a, double b) {
		super();
		this.a = a;
		this.b = b;
		this.c = a;
		this.d = b;
	}
	
	public double calculoPerimetro() {
		return (a+b+c+d);
		
	}
	
	
	}


