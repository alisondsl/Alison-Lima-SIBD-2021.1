/**
 * @author aliso
 *
 */


public class Main {
	/**
	 
	 */
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.alteraNome("Alison");
		aluno1.alteraId(496965);
		aluno1.nota1 = 3.5;
		aluno1.nota2 = 6.5;
		
		
		
		System.out.println("----ALUNO----");
		System.out.println("Nome: " + aluno1.imprimeNome()+"\nId: " + aluno1.imprimeId());
		System.out.println("Média: " + aluno1.retornaMedia()+"\nPassou: " + aluno1.passou());
		
		
	}
	
	
}
