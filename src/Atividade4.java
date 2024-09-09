 import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Crie um programa Java que declare um vetor de inteiros com 3 posições.
        // Use a classe Scanner para pedir ao usuário que insira três números,
        // armazene esses números no vetor e, em seguida,
        // exiba os valores inseridos e
        // também faça uma media de valores.

        int[] posicoes = new int[3];
        double media = 0;

        System.out.println("Digite o primeiro número inteiro: ");
        posicoes[0] = sc.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        posicoes[1] = sc.nextInt();

        System.out.println("Digite o terceiro inteiro: ");
        posicoes[2] = sc.nextInt();



        System.out.println("Esses são os três números inteiros: " + posicoes[0] + ", " + posicoes[1] + ", " + posicoes[2]);

        media = (posicoes[0] + posicoes[1] + posicoes[2]) / 3;

        System.out.println("Média de valores: " + media);

    }
}
