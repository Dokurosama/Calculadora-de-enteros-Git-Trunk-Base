package model;

public class Calculator {
	
	public Calculator() {
		
	}
	
	/**
	 * Metodo para dividir dos enteros y obtener solo la parte entera de la division
	 * @param dividend dividendo de la operacion
	 * @param divider divisor de la operacion
	 * @return parte entera de la division sin aproximar
	 * @throws ArithmeticException
	 */
	public int divide(int dividend, int divider) throws ArithmeticException {
		return dividend/divider;
	}
	
	/**
	 * Metodo para obtener la parte no divisible al dividir dos enteros
	 * @param dividend dividendo de la operacion
	 * @param divider divisor de la operacion
	 * @return parte entera de la division que no pudo ser dividida
	 * @throws ArithmeticException
	 */
	public int module(int dividend, int divider) throws ArithmeticException {
		return dividend%divider;
	}

	/**
	 * Metodo para realizar la multiplicacion de dos numeros
	 * @param numberOne, es el numero que representa al multiplicando
	 * @param numberTwo, es el numero que representa el multiplicador
	 * @return es el producto de la multiplicacion
	 */
	public int multiplication(int numberOne, int numberTwo) {
		return numberOne * numberTwo;
	}
	
	/*
	 * Metodo para sumar dos enteros
	 * @param numberOne numero uno a sumar
	 * @param numberTwo numero dos a sumar
	 * @return suma de dos numeros enteros
	 * */
	public int sum(int numberOne,int numberTwo) {
		return numberOne + numberTwo;
	}
	
	/*
	 * Metodo para restar dos enteros
	 * @param numberOne numero uno a restar
	 * @param numberTwo numero dos que va a restar a numero uno
	 * @return resta de dos numeros enteros
	 * */
	
	public int rest(int numberOne,int numberTwo) {
		return numberOne - numberTwo;
	}

}
