/*
 * Alunos: Alison dos Santos e Maria Fernanda
 * Matrículas: 496965 e 499307
 */



public class RiscoFisico {

	public String[] ferramenta = new String [5];
	public String[] acidente = new String [5];
	
	
	public void registrarComplicacao (String ferramenta, String acidente, int idAcidente) {
		this.ferramenta[idAcidente] = ferramenta;
		this.acidente[idAcidente] = acidente;
		}
	
	public void detectarComplicacao (int idAcidente) {
		System.out.println("-------Risco Físico------- \n-- COMPLICAÇÃO AUDITIVA -- \nFERRAMENTA: " + this.ferramenta[idAcidente] + 
				"\nACIDENTE: " + this.acidente[idAcidente] + "\n");
	}
	
		
	

}
