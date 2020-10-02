
public class Punto {

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public Punto () {
	 x=0;
	 y=0;
	}
	
	public Punto desplazar(double a, double b) {
		x+=a;
		x+=b;
		
		return this;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return  x + ";" + y ;
	}
	
	

	
}
