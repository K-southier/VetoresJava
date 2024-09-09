import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crie um programa Java que declare um vetor de inteiros com 5 posições.
        // Inicialize o vetor com os valores {10, 20, 30, 40, 50} e exiba o terceiro elemento na tela.

        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("Terceiro número: " + numeros[2]);


    }}