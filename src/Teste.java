
public class Teste {


	public static void main(String[] args) {
		RiscoFisico rf = new RiscoFisico();
		RiscoQuimico rq = new RiscoQuimico();
		RiscoErgonomico re = new RiscoErgonomico();
		RiscoBiologico rb = new RiscoBiologico();
		
		rf.registrarComplicacaoAuditiva("Britadeira", "110 dB", 0);
		rq.registrarRiscoQuimico("Inalação de pó de madeira", "câncer nasal", 0);
		rq.registrarRiscoQuimico("Pó de madeira", "irritação", 1);
		re.registrarRiscoErgonomico("Lombalgia", "Manuseio de carga pesada", 0);
		rb.registrarRiscoBiologico("Rato", "Leptospirose", 0);
	
		
		rf.detectarComplicacaoAuditiva(0);
		rq.detectarRiscoQuimico(0);
		rq.detectarRiscoQuimico(1);
		re.detectarRiscoErgonomico(0);
		rb.detectarRiscoBiologico(0);

	}

}
