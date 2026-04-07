package application;

public class ListaExercicios {

	public static void main(String[] args) {
		int[] ar1 = {10, 5, 20, 8, 15, 30};
		int x = 12;
		
		int r1 = ex1(ar1, x);
		System.out.println("Ex 01 - Quantidade de maiores que " + x + ": " + r1);
		
		double r2 = ex2(ar1, x);
		System.out.println("Ex 02 - Soma dos numeros maiores que o numero: " + x + ": " + r2);
		
		double r3 = ex3(ar1, x);
		System.out.println("Ex 03 - Numeros pares: " + r3);

		double[] r4 = ex4(5, 100);
		System.out.println("Valor final de x: " + r4[0]);
	    System.out.println("Quantidade de multiplicações (c): " + (int)r4[1]);
		
		
	}
	
	public static int ex1(int[] A, int x) {
		int c = 0;
		for(int i = 0; i < A.length; i++) {
			if(A[i] > x) {
				c++;
			}
		}
		return c;
	}
	
	public static double ex2(int[] A, int x) {
		double soma = 0;
		for(int i = 0; i < A.length; i++) {
			if(A[i] > x) {
				soma = soma + A[i];
			}
		}
		return soma;
	}
	public static int ex3(int[] A, int x) {
		int c = 0;
		for(int i = 0; i < A.length; i++) {
			if(A[i] % 2 == 0) {
				c++;
			}
		}
		return c;
	}
	public static double[] ex4(double x, double max) {
	    int c = 0;
	    
	    while (x <= max) {
	        x = x * 2;
	        c++;
	    }
	    return new double[] { x, (double) c };
	}
	
}
