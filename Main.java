import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 3;

        // recebe e armazena os dados de n pessoas
        Pessoa[] pessoas = new Pessoa[n];
        int contPessoas = 0;
        for (int i = 1; i <= n; i++) {
            // recebe o nome da i-ésima pessoa
            System.out.printf("Digite o nome da %da pessoa: ", i);
            String nome = teclado.nextLine();
            // recebe o ano de nascimento da i-ésima pessoa
            System.out.printf("Digite o ano de nascimento da %da pessoa: ", i);
            int ano = teclado.nextInt();
            teclado.nextLine(); // consome o Enter
            // cria e armazena na lista um novo objeto pessoa
            Pessoa p = new Pessoa(nome, ano);
            pessoas[contPessoas++] = p;
        }

        // mostra os dados de todas as pessoas
        System.out.println(); // pra deixar uma linha em branco
        for (int i = 0; i < n; i++) {
            System.out.printf("%s terá %d anos\n", pessoas[i].getNome(), pessoas[i].getIdade());
        }
    }
}