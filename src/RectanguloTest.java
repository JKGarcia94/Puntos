
public class RectanguloTest {

	public static void main(String[] args) {
		Rectangulo r= new Rectangulo();
		Triangulo t= new Triangulo();
		Cuadrado c= new Cuadrado();
		
		Figura f= t;
		f.asignarColor("verde");
		System.out.println(t);
		
		//double perimetro=f.perimetro();
		System.out.println(((Triangulo)f).esEquilatero());
	}

}
