
public class Rectangulo extends Figura{
	
	private double lado1;
	private double lado2;
	
	public Rectangulo() {
		super("rojo");
		lado1=1;
		lado2=2;
	}
	
	@Override
	public double perimetro() {
		return lado1*2+lado2*2;
	}
	
	@Override
	public double area() {
		return lado1*lado2;
	}
	
	@Override
	public String toString() {
		return "Rectangulo [lado1=" + lado1 + ", lado2=" + lado2 +","+ super.toString()+ "]";
	}
	
	
}
