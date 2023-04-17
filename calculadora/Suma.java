/** 
 * @author Manuel Pablo
 * @version 0.0.1
 */

 public class Suma {
	
	public float valorAcumulado;

/**
 * Método que retorna el valor acumulado.
 * @return El valor acumulado.
 */
public float getValorAcumulado() {
	return valorAcumulado;
}

/**
 * Método que establece el valor acumulado.
 * @param valorAcumulado El valor acumulado.
 */

public void setValorAcumulado(float valorAcumulado) {
	this.valorAcumulado = valorAcumulado;
}

/**
 * Método que suma dos números reales.
 * @param a El primer número.
 * @param b El segundo número.
 * @return El resultado de la suma de los dos números.
 */

public float dosReales(float a, float b) {
	return a+b;
}

/**
 * Método que suma dos números enteros.
 * @param a El primer número.
 * @param b El segundo número.
 * @return El resultado de la suma de los dos números.
 */

public int dosEnteros(int a, int b) {
	return a+b;
}

/**
 * Método que suma tres números reales.
 * @param a El primer número.
 * @param b El segundo número.
 * @param c El tercer número.
 * @return El resultado de la suma de los tres números.
 */
public float tresReales(float a, float b, float c) {
	return a+b+c;
}

/**
 * Método que suma un número real al valor acumulado.
 * @param a El número a sumar al valor acumulado.
 * @return El valor acumulado actualizado.
 */
public float sumaAcumulado(float a) {
	valorAcumulado = a + valorAcumulado;
	return valorAcumulado;
	}
}