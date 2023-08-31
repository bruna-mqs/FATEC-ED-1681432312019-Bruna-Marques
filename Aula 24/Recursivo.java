package Aula24;

	import javax.swing.JOptionPane;

	public class Recursivo {
	    public static void main(String[] args) {
	        // Solicita ao usuário um número decimal
	        String input = JOptionPane.showInputDialog("Digite um número decimal:");
	        int decimalNumber = Integer.parseInt(input);
	        
	        int base;
	        // Solicita ao usuário a base de conversão desejada (2, 8 ou 16) com validação
	        while (true) {
	            String baseInput = JOptionPane.showInputDialog("Digite a base de conversão (2, 8 ou 16):");
	            base = Integer.parseInt(baseInput);
	            
	            if (base == 2 || base == 8 || base == 16) {
	                break; // Sai do loop se a base for válida
	            } else {
	                JOptionPane.showMessageDialog(null, "Base de conversão não suportada. Tente novamente.");
	            }
	        }
	        
	        // Mostra um resumo da escolha do usuário
	        int confirmResult = JOptionPane.showConfirmDialog(null, 
	                "Você escolheu converter o número decimal " + decimalNumber + " para a base " + base + ".\n"
	                + "Você deseja continuar?", "Resumo da Escolha", JOptionPane.YES_NO_OPTION);
	        
	        if (confirmResult == JOptionPane.YES_OPTION) {
	            // Chama a função de conversão e armazena o resultado e as etapas
	            String[] conversion = decimalToBase(decimalNumber, base);
	            
	            // Exibe o resultado e as etapas de conversão
	            JOptionPane.showMessageDialog(null, "O número decimal " + decimalNumber + " convertido para a base " + base + " é: " + conversion[0] + "\n\nEtapas:\n" + conversion[1]);
	        } else {
	            JOptionPane.showMessageDialog(null, "Operação cancelada.");
	        }
	    }

	    public static String[] decimalToBase(int decimalNumber, int base) {
	        if (decimalNumber == 0) {
	            // Caso base da recursão: número decimal zero
	            return new String[]{"", ""}; // Retorna resultados vazios
	        } else {
	            int remainder = decimalNumber % base;
	            String step = decimalNumber + " ÷ " + base + " = " + (decimalNumber / base) + " sobrou " + remainder;
	            String[] subConversion = decimalToBase(decimalNumber / base, base); // Chamada recursiva
	            String convertedResult = subConversion[0] + remainder;
	            String steps = subConversion[1] + "\n" + step;
	            return new String[]{convertedResult, steps}; // Retorna resultado e etapas
	        }
	    }
	}
