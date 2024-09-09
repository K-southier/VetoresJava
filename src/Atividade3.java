     import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crie um programa Java que declare um vetor de inteiros com 2 posições, atribua os valores 5 e 10.
        // Em seguida, troque os valores entre as duas posições e exiba os resultados.

        int[] posicoes = new int[2];

        posicoes[0] = 5;
        posicoes[1] = 10;

        int temp = posicoes[0];
        posicoes[0] = posicoes[1];
        posicoes[1] = temp;

        System.out.println("Posição 0: " + posicoes[0]);
        System.out.println("Posição 1: " + posicoes[1]);

    }
}
