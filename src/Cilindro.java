
public class Cilindro extends Solidos {

	public Cilindro(int altura, int base, int raio) {
		super(altura, base, raio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 3.14 * (getRaio() * getRaio()) * getAltura();
	}


}
