
public class Geometria {
	
	public static void main (String args[]) {
		
		Cilindro cilindro;
		cilindro = new Cilindro(10, 20, 10);
		System.out.println("O volume do Cilindro é " + cilindro.volume());
		
		Circulo circulo;
		circulo = new Circulo(0, 0, 10);
		System.out.println("A area do circulo: " + circulo.area() + " Circunferencia: " + circulo.perimetro());
		
		Cubo cubo;
		cubo = new Cubo(10, 0, 0);
		System.out.println("O volume do Cubo é " + cubo.volume());
		
		Esfera esfera;
		esfera = new Esfera(0, 0, 10);
		System.out.println("O volume da Esfera é " + esfera.volume());
		
		Losango losango;
		losango = new Losango(10, 20, 0);
		System.out.println("A area do Losango: " + losango.area() + " Perimetro: " + losango.perimetro());
		
		Piramide piramide;
		piramide = new Piramide(10, 30, 0);
		System.out.println("O volume da Piramide é " + piramide.volume());
		
		Quadrado quadrado;
		quadrado = new Quadrado(10, 10, 0);
		System.out.println("A area do Quadrado: " + quadrado.area() + " Perimetro: " + quadrado.perimetro() + " Diagonal: " + quadrado.diagonal());
		
		Retangulo retangulo;
		retangulo = new Retangulo(20, 40, 0);
		System.out.println("A area do Retangulo: " + retangulo.area() + " Perimetro: " + retangulo.perimetro() + " Diagonal: " + retangulo.diagonal());
		
		Trapezio trapezio;
		trapezio = new Trapezio(10, 20, 0, 5);
		System.out.println("A area do Trapezio: " + trapezio.area() + " Perimetro: " + trapezio.perimetro());
		
		Triangulo triangulo;
		triangulo = new Triangulo(20, 40, 0);
		System.out.println("A area do Triangulo: " + triangulo.area() + " Perimetro: " + triangulo.perimetro());








		
		


	}
	

}
