package Geometria;

public class Circulo implements FormaGeometrica{

	protected double r;
	
	//sobrecarga de métodos
	
	public Circulo() {
		r = 1;
	}
	
	public Circulo(double r) {
		this.r = r;
	}

	
	@Override
	public double calculoPerimetro() {
		return (Math.PI*2*r);
	}

	@Override
	public double calculoArea() {
		return (Math.PI*Math.pow(r, 2));
	}

	

}
