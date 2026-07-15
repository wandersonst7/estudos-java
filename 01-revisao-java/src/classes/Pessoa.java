package classes;

// ********** ABSTRACT ********** //
// abstract -> Classe que não pode ser instanciada diretamente e serve como base para outras classes (HERANÇA).

// abstract (classe)
// -> Não pode ser instanciada com "new".
// -> Serve como classe base para outras classes.
// -> Pode possuir métodos abstratos e métodos concretos.

// abstract (método)
// -> Não possui implementação.
// -> Toda subclasse concreta é obrigada a implementá-lo.
// -> Se não implementar, a subclasse também deve ser abstract.

// abstract (atributo)
// -> Não existe em Java.
// -> Apenas CLASSES e MÉTODOS podem ser abstract.

// ********** STATIC ********** //
// static (atributo)
// -> Pertence à classe, e não ao objeto.
// -> Existe apenas uma cópia compartilhada por todas as instâncias.
// -> Pode ser acessado sem criar um objeto.

// static (método)
// -> Pertence à classe, e não ao objeto.
// -> Pode ser chamado sem instanciar a classe.
// -> Só pode acessar diretamente membros (atributos e outros métodos) static.

// static (classe interna)
// -> Apenas classes internas podem ser static.
// -> Não depende de uma instância da classe externa.

// ********** FINAL ********** //
// final (atributo)
// -> O valor (ou a referência) não pode ser alterado após a atribuição.
// -> Se for static final, representa uma constante.

// final (método)
// -> Pode ser herdado.
// -> Não pode ser sobrescrito (override) pelas subclasses.

// final (classe)
// -> Não pode ser herdada (extends).
// -> Impede a criação de subclasses.

public abstract class Pessoa {
    private String nome;
    private int idade;
    private static final String planeta = "Terra";
    private static int quantidade = 0;

    // construtor padrão
    public Pessoa(String nome, int idade){
        quantidade++;
        this.nome = nome;
        this.setIdade(idade);
    }

    // construtor (sobrecarga de construtores)
    // para permitir criar objetos com ou sem nome;
    //    public Pessoa() {
    //        quantidade++;
    //    }
    //
    //    public Pessoa(String nome, int idade) {
    //        this(); // chama o outro construtor
    //        this.nome = nome;
    //        this.setIdade(idade);
    //    }

    // métodos genericos
    // Toda subclasse é obrigada a implementar.
    protected abstract void comer();
    public abstract void apresentar();

    // Pode ser herdado e sobrescrito.
    protected void andar() {
        System.out.println(nome + " está andando.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    // Pode ser herdado, mas NÃO pode ser sobrescrito.
    public final void respirar() {
        System.out.println("Toda pessoa respira.");
    }

    // getters e getters
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        // o this se torna opcional porque não há conflito de nomes
        if (idadeValida(idade)) {
            this.idade = idade; // neste caso é necessário o this
        }
    }

    // Pertencem à classe.
    public static void mostrarPlaneta() {
        System.out.println("Planeta: " + planeta);
    }

    public static int getQuantidadePessoas() {
        return quantidade;
    }

    // utils
    private boolean idadeValida(int idade) {
        return idade >= 0 && idade <= 130;
    }
}
