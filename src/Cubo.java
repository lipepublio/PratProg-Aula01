
public class Cubo extends Solidos {

	public Cubo(int altura, int base, int raio) {
		super(altura, base, raio);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return Math.pow(getAltura(), 3);
	}



}
