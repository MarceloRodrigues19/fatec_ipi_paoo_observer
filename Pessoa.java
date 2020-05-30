package fatec_ipi_paoo_observer;

public abstract class Pessoa implements Observer {
	
	public abstract void querSair();
	
	public Pessoa(Subject s) {
		this.s = s;
	}
	
	private Subject s;
	
	public Subject getS() {
		return s;
	}
}