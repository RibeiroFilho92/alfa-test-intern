package objetos;

public class Registro {

	private Caminhao cam;
	private Unidade und;
	private String data;
	private Movimento movimento;
	private String lacres;
	
	public Registro(Caminhao cam, Unidade und, String data, Movimento movimento, String lacres) {
		this.cam = cam;
		this.und = und;
		this.data = data;
		this.movimento = movimento;
		this.lacres = lacres;
		verificarEspaco();
	}

	public Caminhao getCam() {
		return cam;
	}

	public void setCam(Caminhao cam) {
		this.cam = cam;
	}

	public Unidade getUnd() {
		return und;
	}

	public void setUnd(Unidade und) {
		this.und = und;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Movimento getMovimento() {
		return movimento;
	}

	public void setMovimento(Movimento movimento) {
		this.movimento = movimento;
	}

	public String getLacres() {
		return lacres;
	}

	public void setLacres(String lacres) {
		this.lacres = lacres;
	}
	
	public void verificarEspaco() {
		 
		if (data.equals("") || data.equals(" ")) {
			data =  "EMPTY SPACE!";
		}
		
		if (lacres.equals("") || lacres.equals(" ")) {
			lacres = "EMPTY SPACE!";
		}
		
	}
	
}
