package fatec_ipi_paoo_observer;

public class PontoInicial {

	public static void main(String[] args) {
		Editora e = new Editora();
		e.addObserverEstadaoDiario(new Jose(e));
		e.addObserverEstadao(new Joao(e));
		e.addObserverMarie(new Maria(e));
		
		e.iniciar();
	}

}