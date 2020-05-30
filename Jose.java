package fatec_ipi_paoo_observer;

import java.util.Random;

public class Jose extends Pessoa {
	
	public Jose(Subject s) {
		super(s);
	}
	
	public void verifica(String n) {
		System.out.println(n);
		querSair();	
	}
	
	@Override
	public void update(Entregavel e) {
		verifica(e.getExemplar());
	}

	@Override
	public void querSair() {
		Random gerador = new Random();
		boolean sair = gerador.nextDouble() <= 0.1;
		if(sair) {
			getS().removeObserverEstadaoDiario(this);				
		}
		
	}
}