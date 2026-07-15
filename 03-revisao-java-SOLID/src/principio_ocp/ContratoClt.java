package principio_ocp;

public class ContratoClt extends Funcionario implements Remuneravel{

    public ContratoClt(String nome, String cargo){
        super(nome, cargo);
    }

    public float salario() {
        return 3000;
    }

    @Override
    public float remuneracao(){
        return 3000;
    }
}
