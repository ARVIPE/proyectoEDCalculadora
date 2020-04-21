package proyectoED;

public class Calculadora {

	public int sumar(int a, int b) {
		return a + b;
	}

	public int restar(int a, int b) {
		return a - b;
	}

	public int multiplicar(int a, int b) {
		return a * b;
	}

	public int dividir(int a, int b) {
		return a / b;
	}

	public boolean positivo(int num) {
		if (num >= 0) {
			System.out.println("Positivo");
			return true;
		}else {
			System.out.println("Negativo");
			return false;
		}

	}

	public static void main(String[] args) {

	}
}
