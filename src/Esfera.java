
public class Esfera extends Solidos {

	public Esfera(int altura, int base, int raio) {
		super(altura, base, raio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return (4 * 4.14 * Math.pow(getRaio(), 3))/3;
	}


}
