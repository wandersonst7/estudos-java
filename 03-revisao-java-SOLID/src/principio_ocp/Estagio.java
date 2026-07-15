package principio_ocp;

public class Estagio extends Funcionario implements Remuneravel{

    public Estagio(String nome, String cargo){
        super(nome, cargo);
    }

    public float bolsaAuxilio() {
        return 1000;
    }

    @Override
    public float remuneracao() {
        return 1000;
    }
}
