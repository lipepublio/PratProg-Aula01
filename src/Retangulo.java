
public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(int altura, int base, int raio) {
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
		return Math.sqrt( (getAltura()*2) + (getBase()*2) );
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return (getAltura()*2) + (getBase()*2);
	}

}
