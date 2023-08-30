package Aula23;
import javax.swing.JOptionPane;

public class FibonacciRecursividade {
    
    public static void fibonacciCalc(int anterior, int fibonacci, int n, StringBuilder result) {
        if (n <= 0) {
            return;
        } else {
            fibonacci = fibonacci + anterior;
            anterior = fibonacci - anterior;
            result.append(fibonacci).append(", "); 
            fibonacciCalc(anterior, fibonacci, n - 1, result);
        }
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a quantidade de sequências de Fibonacci deseja:");
        
        try {
            int n = Integer.parseInt(input);

            System.out.println(n + " Sequencia de Fibonacci usando recursividade:");
            int anterior = 0, fibonacci = 1;
            StringBuilder result = new StringBuilder();
            
            if (n >= 1) {
                result.append(0).append(", ");
                fibonacciCalc(anterior, fibonacci, n - 1, result);
            }
          
            if (result.length() >= 2) {
                result.setLength(result.length() - 2);
            }
            System.out.println(result);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido.");
        }
    }
}
