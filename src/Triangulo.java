
public class Triangulo extends Figura{
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo() {
		super("rojo");
		lado1=1;
		lado2=1;
		lado3=3;
	}
	
	@Override
	public double perimetro() {
		return lado1+lado2+lado3;
	}
	
	@Override
	public double area() {
		return lado1*lado2;
	}
	
	public boolean esEquilatero() {
		if(lado1==lado2&&lado2==lado3)
			return true;
		return false;
	}

}
