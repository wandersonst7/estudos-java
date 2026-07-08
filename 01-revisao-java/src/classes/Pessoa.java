package classes;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private static String planeta = 'Terra';
    private static quantidade = 0;

    // construtor
    public Pessoa(){
        this.quantidadePessoas++;
    }

    // métodos genericos
    private void comer() {
        System.out.println("Pessoa está comendo.");
    }

    private void andar() {
        System.out.println("Pessoa está comendo.");
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
        this.idade = idade;
    }

    public String getPlaneta(){
        return planeta;
    }

    public void setPlaneta(String planeta){
        this.planeta = planeta;
    }
}
