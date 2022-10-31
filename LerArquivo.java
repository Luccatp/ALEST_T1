import java.io.File;
import java.util.Scanner;
import java.util.Stack;

public class LerArquivo<E> {

	private Stack<ComplexNumber> pilha = new Stack<ComplexNumber>();

	public void main() {
		File file = new File("arquivosTeste\\arquivoTeste.txt");
		int greaterNumber = 0;
		String proximo = "";
		try (Scanner sc = new Scanner(file)) {
			System.out.println("funcionando");
			while (sc.hasNext()) {
				if (greaterNumber < pilha.size()) {
					greaterNumber = pilha.size();
				}
				proximo = sc.nextLine();
				System.out.println("has line " + proximo);

				handleOperation(proximo);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("topo " + pilha.peek());
			System.out.println("tamanho maximo " + greaterNumber);
			System.out.println("tamanho final " + pilha.size());
		}
	}

	private boolean isNumber(String next) {
		try {
			String[] entrada = next.split(" ");
			int numReal = Integer.parseInt(entrada[0]);
			int numImaginario = Integer.parseInt(entrada[1]);
			ComplexNumber numCompleto = new ComplexNumber(numReal, numImaginario);
			pilha.push(numCompleto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private void handleOperation(String next) {
		ComplexNumber num1;
		ComplexNumber num2;
		if (!isNumber(next)) {
			switch (next) {
				case "+":
					num1 = pilha.pop();
					num2 = pilha.pop();
					pilha.addElement(Calculator.add(num1, num2));
					break;

				case "-":
					num1 = pilha.pop();
					num2 = pilha.pop();
					pilha.addElement(Calculator.subtract(num1, num2));
					break;

				case "*":
					num1 = pilha.pop();
					num2 = pilha.pop();
					pilha.addElement(Calculator.multiply(num1, num2));
					break;

				case "/":
					num1 = pilha.pop();
					num2 = pilha.pop();

					pilha.addElement(Calculator.division(num1, num2));
					break;

				case "inv":
					num1 = pilha.pop();
					pilha.addElement(Calculator.inv(num1));
					break;

				case "chs":
					num1 = pilha.pop();
					pilha.addElement(Calculator.chs(num1));
					break;

				case "conj":
					num1 = pilha.pop();
					pilha.addElement(Calculator.conj(num1));
					break;

				case "abs":
					num1 = pilha.pop();
					pilha.addElement(new ComplexNumber(Calculator.abs(num1), 0));
					break;

				case "pop":
					pilha.pop();
					break;

				case "dup":
					num1 = pilha.peek();
					pilha.addElement(num1);
					break;

				case "swap":
					num1 = pilha.pop();
					num2 = pilha.pop();
					pilha.addElement(num1);
					pilha.addElement(num2);
					break;
				default:
					break;
			}
		}
	}
}