
public class Piramide extends Solidos {

	public Piramide(int altura, int base, int raio) {
		super(altura, base, raio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return (getBase() * getBase() * getAltura()) * 0.3333333;
	}


}
