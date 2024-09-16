import java.time.Year;

class Pessoa {
    // atributos
    private String nome;
    private int anoNascimento;

    // construtor
    public Pessoa(String umNome, int umAno) {
        this.nome = umNome;
        this.anoNascimento = umAno;
    }

    // getter para o nome
    public String getNome() {
        return this.nome;
    }

    // retorna a idade
    public int getIdade() {
        int idade = Year.now().getValue() - this.anoNascimento;
        return idade;
    }
}