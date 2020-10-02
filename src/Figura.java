
public abstract class Figura {
	
	private String color;
	abstract double perimetro();
	abstract double area();
	
	public Figura(String color) {
		this.color= color;
	}
	public void asignarColor(String color) {
		this.color=color;
	}

	@Override
	public String toString() {
		return "color=" + color + "";
	}
	
}
