package calculadora;

/**
*
*Clase que realiza operaciones de multiplicación y potenciación.
*
*
*
*@author Irene Beriain
*@version 0.0.1
*/

public class Producto {

/**
* Este método calcula la multiplicación de dos números de tipo float.
* @param a el primer número float.
* @param b el segundo número float.
* @return el resultado de la multiplicación como un número float.
*/	
	public float dosReales(float a, float b) {
		return a*b;
	}
	
/**
* Este método calcula la multipicación de dos números enteros.
* @param a el primer número entero.
* @param b el segundo número entero.
* @return el resultado de la multiplicación como un número entero.
*/

	public int dosEnteros(int a, int b) {
		return a*b;
	}

/**
*Este método calcula la multipicación de tres números de tipo float.
*@param a el primer número float.
*@param b el segundo número float.
*@param c el tercer número float.
*@return el resultado de la multiplicación como un número float.
*/
	public float tresReales(float a, float b, float c) {
		return a*b*c;
	}
	
/**
*Este método calcula la potencia de un número dado.
*@param base el número base para elevar a la potencia.
*@param exponente el exponente al que se elevará la base.
*@return el resultado de la potencia como un double.
*/

	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
}
