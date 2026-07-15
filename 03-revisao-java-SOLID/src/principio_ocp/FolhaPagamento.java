package principio_ocp;

public class FolhaPagamento {
    protected float saldo;

    /*
        Imagina que esse código tenha sido desenvolvido antes da reforma
        da legislação trabalhista e novas formas de
        contrato passam a se tornar mais comuns,
        como o PJ. Se a empresa for adotar
        novas formas de contrato, seria necessário
        modificar a classe “FolhaDePagamento” e
        como resultado o princípio Aberto-Fechado seria quebrado.
     */
    public void calcular(Funcionario funcionario){
        if(funcionario instanceof ContratoClt){
            this.saldo = ((ContratoClt) funcionario).salario();
        } else if (funcionario instanceof Estagio) {
            this.saldo = ((Estagio) funcionario).bolsaAuxilio();
        }
    }

    // Principio Open Closed
    public void calcularOCP(Remuneravel funcionario){
        this.saldo = funcionario.remuneracao();
    }

    /*
         Como resultado, a classe “FolhaDePagamento” não precisa mais
         saber quais métodos chamar para calcular o pagamento.
         Enquanto a interface "Remunerável" estiver implementada,
         ela poderá calcular corretamente a remuneração de
         qualquer novo tipo de funcionário criado no futuro
         sem precisar alterar seu código-fonte.
     */

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
