
public class Losango extends Poligono {

	public Losango(int altura, int base, int raio) {
		super(altura, base, raio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return getBase()*getAltura();
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return getBase()*4;
	}

}
