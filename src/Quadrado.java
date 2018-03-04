
public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(int altura, int base, int raio) {
		super(altura, base, raio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getBase()*getAltura();
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return getBase()*Math.sqrt(2);
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return getBase()*4;
	}

}
