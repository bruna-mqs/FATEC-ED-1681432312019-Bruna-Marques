package Aula23;

public class FibonacciFor {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Fibonacci usando for:");
			int anterior = 0, fibonacci = 0;
			for( int i = 0; i<= 9; i++) {
				if(i == 0) {
					System.out.println(0);
					System.out.println(1);
					anterior = 1;
					fibonacci = 1;
				}
				else {
					fibonacci = anterior + fibonacci;
					anterior = fibonacci - anterior;
					System.out.println(fibonacci);
				}
			}
		}
	}

