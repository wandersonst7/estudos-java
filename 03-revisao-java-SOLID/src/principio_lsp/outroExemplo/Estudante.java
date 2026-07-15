package principio_lsp.outroExemplo;

public class Estudante {
    String nome;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public void estudar() {
        System.out.println(nome + " está estudando.");
    }
/*
Errado, aluno de pos graduação vai ter essa funcionalidade
mas ele não entrega tcc. Estudante graduação vai sim entregar tcc
entao o método fica nele.
* */
//    public void entregarTCC(){
//        System.out.println(nome + " está entregando tcc.");
//    }
}
