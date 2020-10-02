
public class Punto3D  extends Punto{
	
	private double z;
	
	public Punto3D(double x,double y,double z) {
		super(x,y);
		this.z=z;
	}
	
	public Punto3D() {
	 super();
	 this.z=0;
	}
	//@Override
	//public String toString() {
	//	return "Punto3D: ("+getX() +";"+getY()+";" + z + ")";
	//}
	
	public double getModulo() {
		return Math.sqrt(getX()*getX()+getY()*getY()+this.z*this.z);
	}
	
	@Override
	public String toString() {
		return super.toString()+";"+z;
	}
	
	/*public void desplazar(double a, double b, double c) {
	  
		x+=a;
		y+=b;
		this.z+=c;
	}*/
	
	public Punto3D desplazar(double a, double b, double c) {
		  
		//super.x+=a; No puedo hacer esto por que las declare como privadas
		//super.y+=b; Tampoco. Tengo que usar el despalazamiento de 2D
		super.desplazar(a, b);
		this.z+=c;
		
		return this;
	}
	
	

}
