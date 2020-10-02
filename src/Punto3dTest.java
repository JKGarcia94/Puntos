
public class Punto3dTest {

	public static void main(String[] args) {
		
		Punto puntillo= new Punto();
		System.out.println(puntillo);
		
		Punto3D puntillodeOtraDimension= new Punto3D(1,2,5);
		System.out.println(puntillodeOtraDimension);
		
		//puntillodeOtraDimension.desplazar(5,6,7);
		//System.out.println(puntillodeOtraDimension);
		
		System.out.println(puntillodeOtraDimension.desplazar(5,5,7));
		
		Punto p2= new Punto3D();//El padre puede apuntar a los hijos
		//Punto3D p3= new Punto();//El hijo no puede apuntar al padre
		
		

	}

}
