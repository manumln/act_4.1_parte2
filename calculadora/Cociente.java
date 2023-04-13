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

	//Métodos
	/**
	 * Divide dos números reales, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Dividendo de la operación
	 * @param b Divisor de la operación<br>
	 * <ul><li>Si el divisor es 0 el resultado será error pues no se puede dividir entre cero</li></ul>
	 * @return Resultado de la división<br>
	 * <ul><li>Puede dar resultado con decimales</li></ul>
	 */
	public float dosReales(float a, float b) {
		return a/b;
	}
	/**
	 * Divide dos números enteros, recibe dos valores <b>positivos</b> y retorna el resultado
	 * @param a Dividendo de la operación
	 * @param b Divisor de la operación <br>
	 * <ul><li>Si el divisor es 0 el resultado será error pues no se puede dividir entre cero</li></ul>
	 * @return Resultado de la división <br>
	 * <ul><li>Si el divisor es mayor al dividendo, el resultado será cero. Para ver los decimales usa dosReales()</li></ul>
	 * @see dosReales(float, float)
	 */
	public int dosEnteros(int a, int b) {
		return a/b;
	}
	/**
	 * Realiza el inverso del número real dado: cambia un número negativo a positivo y el positivo a negativo.
	 * @param a Número del que se quiere obtener su inverso
	 * @return Número inverso
	 */
	public float inversoReal(float a) {
		return a - (a * 2);
	}
	/**
	 * Raíz cuadrada de un número
	 * @param a Valor del cual se quiere obtener la raíz cuadrada <br>
	 * <ul><li>Solo acepta números <b>positivos</b>. No podemos obtener la raíz cuadrada de un número negativo</li></ul>
	 * @return Resultado de la raíz cuadrada <br>
	 * <ul><li>Puede dar resultado con decimales</li></ul>
	 */
	public double raiz (double a) {
		return Math.sqrt(a);
	}
}
