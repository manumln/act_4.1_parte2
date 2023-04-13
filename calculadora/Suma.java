package calculadora;


public class Suma {
	
	public float valorAcumulado;
	
	public float getValorAcumulado() {
		return valorAcumulado;
	}

	public void setValorAcumulado(float valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}
	
	
	public float dosReales(float a, float b) {
		return a+b;
	}
	
	public int dosEnteros(int a, int b) {
		return a+b;
	}
	
	public float tresReales(float a, float b, float c) {
		return a+b+c;
	}
	
	public float sumaAcumulado(float a) {
		valorAcumulado = a + valorAcumulado;
		return valorAcumulado;
	}
}



