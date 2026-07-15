package classes;

public class Aluno extends Pessoa{
    private String matricula;
    private boolean matriculaAtiva;

    // Encadeamento de construtores (Constructor Chaining)
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
        this.matriculaAtiva = true;
    }

    @Override
    protected void comer() {
        System.out.println("O aluno " + this.getNome() + " está comendo.");
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.getNome());
    }

    // Polimorfismo de sobrescrita
    @Override
    protected void andar() {
        System.out.println("O aluno " + this.getNome() + " está andando.");
    }

    @Override
    public void dormir() {
        System.out.println("O aluno " + this.getNome() + " está dormindo.");
    }

    // Polimorfismo de sobrecarga
    public void dormir(boolean cochilo) {
        if(cochilo){
            System.out.println("O aluno " + this.getNome() + " está tirando um cochilo.");
            return;
        }

        this.dormir();
    }

    public void desativarMatricula(){
        this.matriculaAtiva = false;
    }

    public void ativarMatricula(){
        this.matriculaAtiva = true;
    }

    // getters e setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isMatriculaAtiva() {
        return matriculaAtiva;
    }

    public void setMatriculaAtiva(boolean matriculaAtiva) {
        this.matriculaAtiva = matriculaAtiva;
    }
}
