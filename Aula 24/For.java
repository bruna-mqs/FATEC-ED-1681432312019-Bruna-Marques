package Aula24;
import javax.swing.JOptionPane;

	
	public class For {

		    public static void main(String[] args) {
		        // Solicita ao usuário um número decimal
		        String input = JOptionPane.showInputDialog("Digite um número decimal:");
		        int decimalNumber = Integer.parseInt(input);

		        int base;
		        // Solicita ao usuário a base de conversão desejada (2, 8 ou 16) com verificação
		        while (true) {
		            String baseInput = JOptionPane.showInputDialog("Digite a base de conversão (2, 8 ou 16):");
		            base = Integer.parseInt(baseInput);

		            if (base == 2 || base == 8 || base == 16) {
		                break; // Sai do loop se a base for válida
		            } else {
		                JOptionPane.showMessageDialog(null, "Não existe essa base de conversão.Tente novamente.");
		            }
		        }

		        // Inicializa as variáveis para o resultado e as etapas de conversão
		        String result = "";
		        StringBuilder steps = new StringBuilder();

		        // Realiza a conversão com base na escolha do usuário
		        result = decimalToBase(decimalNumber, base, steps);

		        // Exibe o resultado e as etapas de conversão
		        JOptionPane.showMessageDialog(null, "O número decimal " + decimalNumber + " convertido para a base " + base + " é: " + result + "\n\nEtapas:\n" + steps.toString());
		    }

		    // Função para converter decimal para outra base
		    public static String decimalToBase(int decimalNumber, int base, StringBuilder steps) {
		        String baseNumber = "";

		        for (int quotient = decimalNumber; quotient > 0; quotient /= base) {
		            int remainder = quotient % base;
		            steps.append(quotient).append(" ÷ ").append(base).append(" = ").append(quotient / base).append(" sobrou ").append(remainder).append("\n");

		            if (base == 16 && remainder >= 10) {
		                char hexChar = (char) ('A' + (remainder - 10));
		                baseNumber = hexChar + baseNumber;
		            } else {
		                baseNumber = remainder + baseNumber;
		            }
		        }

		        return baseNumber;
		    }
		}
