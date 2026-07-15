package classes;

public class Professor extends Pessoa{
    private String matricula;
    private Disciplina disciplina;
    private boolean matriculaAtiva;

    public Professor(String nome,
         int idade,
         String matricula,
         Disciplina disciplina)
    {
        super(nome, idade);
        this.matricula = matricula;
        this.disciplina = disciplina;
    }

    // Polimorfismo de sobrescrita
    @Override
    protected void comer() {
        System.out.println("O professor " + this.getNome() + " está comendo.");
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.getNome() + " e sou professor");
    }

    // Polimorfismo de sobrecarga
    public void dormir(boolean cochilo) {
        if(cochilo){
            System.out.println("O professor " + this.getNome() + " está tirando um cochilo.");
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

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public boolean isMatriculaAtiva() {
        return matriculaAtiva;
    }

    public void setMatriculaAtiva(boolean matriculaAtiva) {
        this.matriculaAtiva = matriculaAtiva;
    }
}
