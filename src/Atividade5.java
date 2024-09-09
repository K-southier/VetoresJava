import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crie um programa Java que declare um vetor de strings com 3 posições.
        // Use a classe Scanner para pedir ao usuário que insira três nomes,
        // armazene esses nomes no vetor e, em seguida,
        // exiba os nomes inseridos.

        String[] nomes = new String[3];

        System.out.println("Digite o primeiro nome: ");
        nomes[0] = sc.nextLine();

        System.out.println("Digite o segundo nome: ");
        nomes[1] = sc.nextLine();

        System.out.println("Digite o terceiro nome: ");
        nomes[2] = sc.nextLine();

        System.out.println("ESSES SÃO OS NOMES INSERIDOS: " + nomes[0] + "," + nomes[1] + "," + nomes[2]);
    }
}
