/*
 * Alunos: Alison dos Santos e Maria Fernanda
 * Matr�culas: 496965 e 499307
 */



public class RiscoFisico {

	public String[] ferramenta = new String [5];
	public String[] nivelRuido = new String [5];
	
	
	public void registrarComplicacaoAuditiva (String ferramenta, String nivelRuido, int idAcidente) {
		this.ferramenta[idAcidente] = ferramenta;
		this.nivelRuido[idAcidente] = nivelRuido;
		}
	
	public void detectarComplicacaoAuditiva (int idAcidente) {
		System.out.println("-------Risco F�sico------- \n-- COMPLICA��O AUDITIVA -- \nFERRAMENTA: " + this.ferramenta[idAcidente] + 
				"\nN�VEL DO RU�DO: " + this.nivelRuido[idAcidente] + "\n");
	}
	
		
	

}
