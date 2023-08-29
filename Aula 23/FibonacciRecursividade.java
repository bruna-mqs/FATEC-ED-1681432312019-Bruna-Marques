package Aula23;

public class FibonacciRecursividade {
	
		public static void fibonacciCalc(int anterior, int fibonacci) {
			if(fibonacci == 89) {
				return;
			}
			else {
				fibonacci = fibonacci + anterior;
				anterior = fibonacci - anterior;
				System.out.println(fibonacci);
				fibonacciCalc(anterior, fibonacci);
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Fibonacci usando recursividade:");
			int anterior = 0, fibonacci = 1;
			System.out.println(0);
			fibonacciCalc(anterior, fibonacci);
		}
	}

