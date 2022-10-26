import java.io.File;
import java.util.Scanner;
import java.util.Stack;

public class LerArquivo {
    static String FILE_PATH = "arquivosTeste\\arquivoTeste.txt";

    private Stack<Double> pilha = new Stack<Double>();
    private Double smallerNumber = 0.0;
    private Double greaterNumber = 0.0;

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

                //newOperation(next);

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
}