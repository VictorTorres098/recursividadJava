package factorialPackage;

public class Ejercicios {

	public static void main(String[] args) {
		System.out.println(factorial(7));

	}
	//ejercicio 1
	//factorial es una funcion recursiva de matematicas lest do it
	public static int factorial(int n) {
		if(n == 0) {	//por la definicion de factorial 0! = 1 factorial de 0 es 1 jeje
			return 1;
		}else {
			int recursion = factorial(n-1);
			int resultado = n * recursion;
			return resultado;
		}
		
	}

}
