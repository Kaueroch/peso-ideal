import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Peso ideal!");
        System.out.println("1-Homem");
        System.out.println("2-Mulher");
        int escolha = sc.nextInt();
        switch (escolha){
            case 1:

                System.out.println("Qual a sua altura?");
                double altura = sc.nextDouble();
                double ph = (72.7 * altura) - 58;
                System.out.println("O seu peso ideal é:" + ph);
                break;

            case 2:
                System.out.println("Qual a sua altura?");
                double h = sc.nextDouble();
                double mh = (62.1 *h) - 44.7;
                System.out.println("O seu peso ideal é:" + mh);
                break;
            default:
                throw new IllegalStateException("Escolha Inválida: " + escolha);
        }

    }
}
/*******************************************************************************
 * 25) Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um
 * programa que calcule seu peso ideal, utilizando as seguintes fórmulas:
 * (h = altura)
 *   - Para homens: (72.7*h) - 58
 *   - Para mulheres: (62.1 *h) - 44.7
 *******************************************************************************/
