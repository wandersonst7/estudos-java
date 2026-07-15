package principio_srp;

/*
    S - Princípio da Responsabilidade Única
    Como poderíamos esperar, esse princípio afirma
    que uma classe deve ter apenas uma responsabilidade.
    Ou seja, cada classe ou estrutura semelhante no código
    da sua aplicação deve fazer apenas um trabalho.
 */

public class AlunoCorreto {
    private String nome;
    private int idade;

    public AlunoCorreto(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Metodos
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }

    public String exibirInfo() {
        return "Aluno: " + nome + ", Idade: " + idade;
    }
}
