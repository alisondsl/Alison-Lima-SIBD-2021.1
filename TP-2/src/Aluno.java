
public class Aluno {
	private String name;
	private int id;
	private double media;
	protected double nota1;
	protected double nota2;
	
	
	public Aluno() {
		super();
	}
	
	//1 método altera nome
	public void alteraNome (String name) {
		this.name = name;
	}
	
	//2 método imprime nome 
	public String imprimeNome() {
		return name;
	}
	
	//3 método altera id
	public void alteraId(int id) {
		this.id = id;
	}
	
	//4 método imprime id
	public int imprimeId() {
		return id;
	}
	
	//5 método calculo média
	private double calculoMedia() {
		return (nota1+nota2)/2;
	}
	
	
	//6 metodo retorna media
	public double retornaMedia() {
		double media = this.calculoMedia();
		return media;
	}
	
	//7 metodo passou
	public String passou() {
		double passouMedia = this.retornaMedia();
		
		if (passouMedia >= 7) {
			return "True";
		}
		return "False";
		
	}
	
	
	
	
	
	}

	
	

	
	
	

	


	
	
	



