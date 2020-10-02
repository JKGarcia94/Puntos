
public class Cuadrado extends Figura{
	private double lado1;
	
	public Cuadrado() {
		super("rojo");
		lado1=1;
	}
	
	@Override 
	public double perimetro() {
		return lado1*4;
	}
	
	@Override  
	public double area() {
		return lado1*lado1;
	}

}
