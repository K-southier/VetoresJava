import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crie um programa Java que declare um vetor de inteiros com 4 posições,
        // atribua os valores 3, 6, 9, 12 e
        // calcule a soma do primeiro e último elementos, exibindo o resultado.

        int[] posicoes = new int[4];
        int soma =0;

        posicoes[0] = 3;
        posicoes[1] = 6;
        posicoes[2] = 9;
        posicoes[3] = 12;

        soma = posicoes[0] + posicoes[3];
        System.out.println(soma);


    }
}
