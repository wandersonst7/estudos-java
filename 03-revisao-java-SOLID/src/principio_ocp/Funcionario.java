package principio_ocp;

/*
    O - Princípio Aberto-Fechado afirma que as classes ou objetos
    devem ser abertos para extensão, mas fechados para modificação.

    “Aberto para extensão” diz que você deve projetar suas classes
    para que novas funcionalidades possam ser adicionadas
    à medida que novos requisitos são gerados.

    “Fechado para modificação” significa que uma vez que
    uma classe tenha sido desenvolvida ela
    nunca deve ser modificada, exceto para corrigir
    bugs e demais problemas no código.
*/

public class Funcionario {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
