package principio_lsp.outroExemplo;

public class EstudanteGraduacao extends Estudante{
    public EstudanteGraduacao(String nome){
        super(nome);
    }

    @Override
    public void estudar() {
        System.out.println(nome + " está estudando e pesquisando.");
    }

    public void entregarTCC(){
        System.out.println(nome + " está entregando tcc.");
    }
}
