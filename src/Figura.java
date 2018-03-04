
public abstract class Figura {
	
	private int altura;
	private int base;
	private int raio;
	
	public Figura(int altura, int base, int raio) {
		this.altura = altura;
		this.base = base;
		this.raio = raio;
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	
}

