package Geometria;

public class Test {

	public static void main(String[] args) {
		
	Retangulo ret = new Retangulo(10, 2);
	Quadrado quad = new Quadrado(5);
	Circulo circ = new Circulo(2); //raio a definir
	Circulo circ1 = new Circulo(); //c�rculo de raio 1
	
	
	System.out.println("----RET�NGULO----\n" +"Per�metro: " + ret.calculoPerimetro() + "\n" + "�rea: " + ret.calculoArea());
	System.out.println("----QUADRADO----\n" +"Per�metro: " + quad.calculoPerimetro() + "\n" + "�rea: " + quad.calculoArea());
	System.out.println("----C�RCULO----\n" +"Per�metro: " + circ.calculoPerimetro() + "\n" + "�rea: " + circ.calculoArea() +
			"\n" + "Raio:" +circ.r);
	System.out.println("----C�RCULO----\n" +"Per�metro: " + circ1.calculoPerimetro() + "\n" + "�rea: " + circ1.calculoArea() +
			"\n" + "Raio:" +circ1.r);
	
	
	
		
		
		
		
		
		
		
		
		
		
		
}
}
