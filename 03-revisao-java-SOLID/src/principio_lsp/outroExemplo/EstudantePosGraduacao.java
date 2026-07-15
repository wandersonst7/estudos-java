package principio_lsp.outroExemplo;

public class EstudantePosGraduacao extends Estudante{

    public EstudantePosGraduacao(String nome) {
        super(nome);
    }

    @Override
    public void estudar() {
        System.out.println(nome + " está estudando e pesquisando.");
    }
}
