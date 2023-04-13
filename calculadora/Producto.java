package calculadora;


public class Producto {

	
	public float dosReales(float a, float b) {
		return a*b;
	}
	
	public int dosEnteros(int a, int b) {
		return a*b;
	}
	
	public float tresReales(float a, float b, float c) {
		return a*b*c;
	}
	
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
}
