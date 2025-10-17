
import java.util.Scanner;


public class Q20 {
    public static void main(String[] args) {
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Menu de opções:");
        System.out.println("1. Média aritmética");
        System.out.println("2. Média ponderada");
        System.out.println("3. Sair");
        System.out.println("Digite a opção desejada.");
        op = entrada.nextInt();

        switch (op) {
            case 1: 
            System.out.println("Informa a 1° nota: ");
            double nota1 = entrada.nextDouble();
            System.out.println("Informa a 2° nota: ");
            double nota2 = entrada.nextDouble();
            double media = (nota1 + nota2)/2;
            System.out.println("A média é: "+media);
            break;

            case 2: 
            System.out.println("Informa a 1° nota: ");
            nota1 = entrada.nextDouble();
            System.out.println("Informa o peso 1: ");
            double peso1 = entrada.nextDouble();

            System.out.println("Informa a 2° nota: ");
            nota2 = entrada.nextDouble();
            System.out.println("Informa o peso 2: ");
            double peso2 = entrada.nextDouble();

            System.out.println("Informa a 3° nota: ");
            double nota3 = entrada.nextDouble();
            System.out.println("Informa o peso 3: ");
            double peso3 = entrada.nextDouble();
            media = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1+peso2+peso3);
            System.out.println("A média ponderada vale: "+media);

            break;

            case 3:
            System.out.println("Até logo");
            break;
        
            default:System.out.println("Opção inválida");
            break;
        }

        entrada.close();
    }
}
