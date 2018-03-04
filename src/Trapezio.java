
public class Trapezio extends Poligono {
	
	int bmenor;

	public Trapezio(int altura, int base, int raio, int bmenor) {
		super(altura, base, raio);
		this.bmenor = bmenor;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return ((getBase()+bmenor) * getAltura()) /2 ;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return getBase() + bmenor + getAltura()*2;
	}

}
