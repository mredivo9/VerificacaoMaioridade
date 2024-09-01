import java.util.Scanner;

public class VericacaoMaiorIdade {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                Double idade = 0d;

                System.out.println("Digite o valor do maior idade: ");
                idade = sc.nextDouble();
                if (idade > 18) {
                    System.out.println("Maior idade");
                }
                else if (idade < 18) {
                    System.out.println("Menor idade");
                }
        }





}
