package Geometria;

public class Test {

	public static void main(String[] args) {
		
	Retangulo ret = new Retangulo(10, 2);
	Quadrado quad = new Quadrado(5);
	Circulo circ = new Circulo(2); //raio a definir
	Circulo circ1 = new Circulo(); //círculo de raio 1
	
	
	System.out.println("----RETÂNGULO----\n" +"Perímetro: " + ret.calculoPerimetro() + "\n" + "Área: " + ret.calculoArea());
	System.out.println("----QUADRADO----\n" +"Perímetro: " + quad.calculoPerimetro() + "\n" + "Área: " + quad.calculoArea());
	System.out.println("----CÍRCULO----\n" +"Perímetro: " + circ.calculoPerimetro() + "\n" + "Área: " + circ.calculoArea() +
			"\n" + "Raio:" +circ.r);
	System.out.println("----CÍRCULO----\n" +"Perímetro: " + circ1.calculoPerimetro() + "\n" + "Área: " + circ1.calculoArea() +
			"\n" + "Raio:" +circ1.r);
	
	
	
		
		
		
		
		
		
		
		
		
		
		
}
}
