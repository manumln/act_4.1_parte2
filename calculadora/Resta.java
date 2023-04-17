/** 
 * 
 * @author Alejandro Galán Herrera
 * 
 * La variable "valorAcumulado" almacena el resultado acumulado de operaciones de resta. 
 */

 package calculadora;

 public class Resta {

public float valorAcumulado;

/** 
 * es un método de acceso que devuelve el valor actual de la variable"valorAcumulado".
 * @return el valor actual de "valorAcumulado".
 */
public float getValorAcumulado() {
	return valorAcumulado;
}

/** 
 * es un método que establece el valor de la variable  "valorAcumulado".
 * @param valorAcumulado el nuevo valor a establecer para "valorAcumulado".
 */
public void setValorAcumulado(float valorAcumulado) {
	this.valorAcumulado = valorAcumulado;
}

/** 
 * Este método toma dos argumentos de tipo float "a" y "b" y devuelve la resta de "a" y "b".
 * @param a el primer número de la resta.
 * @param b el segundo número de la resta.
 * @return el resultado de la resta de "a" y "b".
 */
public float dosReales(float a, float b) {
	return a-b;
}

/** 
 * Este método toma dos argumentos de tipo int "a" y "b" y devuelve la resta de "a" y "b".
 * @param a el primer número de la resta.
 * @param b el segundo número de la resta.
 * @return el resultado de la resta de "a" y "b".
 */
public int dosEnteros(int a, int b) {
	return a-b;
}

/** 
 * Este método toma tres argumentos de tipo float "a", "b" y "c" y devuelve la resta de "a", "b" y "c".
 * @param a el primer número de la resta.
 * @param b el segundo número de la resta.
 * @param c el tercer número de la resta.
 * @return el resultado de la resta de "a", "b" y "c".
 */
public float tresReales(float a, float b, float c) {
	return a-b-c;
}

/** 
 * Este método toma un argumento de tipo float "a" y resta este valor de la variable de instancia "valorAcumulado". 
 * Luego, devuelve el nuevo valor de "valorAcumulado".
 * @param a el valor a restar de "valorAcumulado".
 * @return el nuevo valor de "valorAcumulado" después de restar "a".
 */
public float restaAcumulado(float a) {
	valorAcumulado = valorAcumulado - a;
	return valorAcumulado;
}
}
 