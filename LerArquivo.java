import java.io.File;
import java.util.Scanner;
import java.util.Stack;

public class LerArquivo<E> {
    static String FILE_PATH = "arquivosTeste\\arquivoTeste.txt";

    private Stack<ComplexNumber> pilha = new Stack<ComplexNumber>();
    private ComplexNumber smallerNumber = new ComplexNumber(0, 0);
    private ComplexNumber greaterNumber = new ComplexNumber(0, 0);

    File file = new File(FILE_PATH);

    public void main() {
        String next = "";
        try (Scanner sc = new Scanner(file)) {
            System.out.println("passou scanner");
            while (sc.hasNext()) {
                next = sc.nextLine();
                System.out.println("has line: " + sc.nextLine());

                if ("quit".equalsIgnoreCase(next))
                    break;

                handleOperation(next);

                if (!pilha.isEmpty()) {
                    if (greaterNumber.compareTo(pilha.peek()) < 0)
                        System.out.println("greaterNumber: " + pilha.peek());
                    greaterNumber = pilha.peek();

                    if (smallerNumber.compareTo(pilha.peek()) > 0)
                        smallerNumber = pilha.peek();

                }
            }
        } catch (Exception e) {
            System.out.println("Erro na leitura de arquivo.\n Tente novamente.");
        } finally {
            System.out.println("\n\t===== FIM =====");
            System.out.println("|= Tamanho máximo da pilha: " + greaterNumber);
            System.out.println("|= Tamanho final da pilha: " + pilha.size());
            System.out.println("|= Topo da pilha: " + pilha.peek());
        }
    }

    private boolean isNumber(String next) {
        try {
            String[] entrada = next.split(" ");
            Double numReal = Double.parseDouble(entrada[0]);
            Double numImaginario = Double.parseDouble(entrada[1]);
            ComplexNumber numCompleto = new ComplexNumber(numReal, numImaginario);
            pilha.push(numCompleto);
            return true;
        } catch (Exception e) {
            System.out.println(e);
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
                    pilha.add(Calculator.add(num1, num2));
                    break;
            
                case "-":
                    num1 = pilha.pop();
                    num2 = pilha.pop();
                    pilha.add(Calculator.subtract(num1, num2));
                    break;
                
                case "*":
                    num1 = pilha.pop();
                    num2 = pilha.pop();
                    pilha.add(Calculator.multiply(num1, num2));
                    break;
                
                case "/":
                    num1 = pilha.pop();
                    num2 = pilha.pop();
                
                    pilha.add(Calculator.division(num1, num2));
                    break;
                    
                case "inv":
                    num1 = pilha.pop();
                    pilha.add(Calculator.(num1));            
                    break;
                
                case "chs":
                    num1 = pilha.pop();
                    pilha.add(Calculator.(num1));
                    break;
                    
                case "conj":
                    num1 = pilha.pop();
                    pilha.add(Calculator.(num1));
                    break;
                    
                case "abs":
                    num1 = pilha.pop();
                    pilha.add(new NumeroComplexo(CalculadoraComplexo.absolute(num1), 0));
                    break;
                
                case "pop":
                    pilha.pop();
                    break;
                    
                case "dup":
                    Calculator.();
                    break;
                    
                case "swap":
                swap();
                break;
                
                case "print":
                    print();
                    break;
                
                default:
                    System.out.println("Operação (" + next + ") inválida.");
                    break;
                
            }
        }
    }
}