package principio_srp;

/*
    S - Princípio da Responsabilidade Única
    Como poderíamos esperar, esse princípio afirma que uma
    classe deve ter apenas uma responsabilidade.
    Ou seja, cada classe ou estrutura semelhante
    no código da sua aplicação deve fazer apenas um trabalho.
 */

public class AlunoIncorreto {
    private String nome;
    private int idade;

    public AlunoIncorreto(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void salvarNoBancoDeDados() {
        System.out.println("Salvando o aluno no banco de dados...");
    }

    public String gerarRelatorio() {
        return "Relatório do Aluno: Nome - " + nome + ", Idade - " + idade;
    }

    public void enviarEmail() {
        System.out.println("Enviando os dados do aluno por email...");
    }
}
