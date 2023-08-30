package Aula23;

import javax.swing.JOptionPane;

public class FibonacciFor {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a quantidade de sequências de Fibonacci deseja:");
        
        try {
            int n = Integer.parseInt(input);

            System.out.println("Fibonacci usando for:");
            int anterior = 0, fibonacci = 0;

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    System.out.println(0);
                    anterior = 1;
                    fibonacci = 1;
                } else {
                    fibonacci = anterior + fibonacci;
                    anterior = fibonacci - anterior;
                    System.out.println(fibonacci);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido.");
        }
    }
}
