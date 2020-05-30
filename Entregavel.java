package fatec_ipi_paoo_observer;

public abstract class Entregavel implements Subject{
	private String exemplar;
	
	
	public Entregavel() {
		
	}
	
	public String getExemplar() {
			return exemplar;
		}
		
	public void setExemplar (String exemplar) {
			this.exemplar = exemplar;
		}

	}

