
public class Teste {


	public static void main(String[] args) {
		/*
		 RiscoFisico rf = new RiscoFisico();
		
		RiscoQuimico rq = new RiscoQuimico();
		RiscoErgonomico re = new RiscoErgonomico();
		RiscoBiologico rb = new RiscoBiologico();
		
		rf.registrarComplicacao("Britadeira", "110 dB", 0);
		rq.registrarRiscoQuimico("Inala��o de p� de madeira", "c�ncer nasal", 0);
		rq.registrarRiscoQuimico("P� de madeira", "irrita��o", 1);
		re.registrarRiscoErgonomico("Lombalgia", "Manuseio de carga pesada", 0);
		rb.registrarRiscoBiologico("Rato", "Leptospirose", 0);
	
		
		rf.detectarComplicacao(0);
		rq.detectarRiscoQuimico(0);
		rq.detectarRiscoQuimico(1);
		re.detectarRiscoErgonomico(0);
		rb.detectarRiscoBiologico(0);*/

		ConnectDB connection = new ConnectDB();
		connection.abreConnection();
		CRUD crudd = new CRUD(connection.getConnection());
		
		crudd.createAcidente(4, "Fab�ola Rocha", "Industrial", "30/08/2021", 1, "Decepamento do dedo", "M�quina de corte");
		
		connection.fechaConnection();

	}

}
