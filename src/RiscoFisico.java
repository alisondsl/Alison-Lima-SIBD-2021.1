/*
 * Alunos: Alison dos Santos e Maria Fernanda
 * Matrículas: 496965 e 499307
 */



public class RiscoFisico {

	public String[] ferramenta = new String [5];
	public String[] nivelRuido = new String [5];
	
	
	public void registrarComplicacaoAuditiva (String ferramenta, String nivelRuido, int idAcidente) {
		this.ferramenta[idAcidente] = ferramenta;
		this.nivelRuido[idAcidente] = nivelRuido;
		}
	
	public void detectarComplicacaoAuditiva (int idAcidente) {
		System.out.println("-------Risco Físico------- \n-- COMPLICAÇÃO AUDITIVA -- \nFERRAMENTA: " + this.ferramenta[idAcidente] + 
				"\nNÍVEL DO RUÍDO: " + this.nivelRuido[idAcidente] + "\n");
	}
	
		
	

}
