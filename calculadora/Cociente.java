/*División de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
Inverso de un números real, tendrá un parámetros de entrada y uno de salida que será la solución.
Raíz de un números, tendrá un parámetros de entrada y uno de salida que será la solución.
 */
package calculadora;

/**
 * Clase en la que se engloban todos los métodos de la división en la calculadora
 * @see calculadora
 * @author E.M.R
 * @version 1.0.0
 * @since 14/04/2023
 *
 */


public class Cociente {

	
	public float dosReales(float a, float b) {
		return a/b;
	}
	
	public int dosEnteros(int a, int b) {
		return a/b;
	}
	
	public float inversoReal(float a) {
		return a - (a * 2);
	}
	
	public double raiz (double a) {
		return Math.sqrt(a);
	}
}
