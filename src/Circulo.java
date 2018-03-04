
public class Circulo extends Poligono {

	public Circulo(int altura, int base, int raio) {
		super(altura, base, raio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14 * Math.pow(getRaio(), 2) ;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 3.14 * 2 * getRaio();
	}


}
