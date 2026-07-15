package classes;

import java.util.ArrayList;

public class Escola {
    private String nome;
    private String endereco;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;

    // Construtor
    public Escola(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    // métodos
    public String matricularAluno(Aluno aluno){
        this.alunos.add(aluno);
        return "Aluno " + aluno.getNome() + " matriculado com sucesso.";
    }

    public String desmatricularAluno(Aluno aluno){
        if(alunos.contains(aluno)) {
            aluno.desativarMatricula();
            return "Aluno " + aluno.getNome() + " desmatriculado com sucesso.";
        }

        return "Aluno não encontrado nesta escola.";
    }

    public String matricularProfessor(Professor professor){
        if(this.disciplinas.contains(professor.getDisciplina())){
            this.professores.add(professor);
            return "Professor " + professor.getNome() + " matriculado com sucesso.";
        }

        return "A escola não possui a disciplina deste professor: " + professor.getDisciplina().getNome();
    }

    public String desmatricularProfessor(Professor professor){
        if(professores.contains(professor)) {
            professor.desativarMatricula();
            return "Professor "+ professor.getNome() +" desmatriculado com sucesso.";
        }

        return "Professor "+ professor.getNome() +" não encontrado nesta escola.";
    }

    public String adicionarDisciplina(Disciplina disciplina){
        if(!this.disciplinas.contains(disciplina)) {
            this.disciplinas.add(disciplina);
        }

        return "Disciplina: " + disciplina.getNome() + " adicionada com sucesso.";
    }

    public String removerDisciplina(Disciplina disciplina){
        // foreach do java
        for(Professor professor : this.professores){
            if(professor.getDisciplina().equals(disciplina)
                    && professor.isMatriculaAtiva()){

                return "A disciplina não pode ser removida porque tem professores vinculados a ela!";
            }
        }

        this.disciplinas.remove(disciplina);
        return "Disciplina "+ disciplina.getNome() +" removida com sucesso.";
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
