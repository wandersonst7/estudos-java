import classes.Aluno;
import classes.Disciplina;
import classes.Escola;
import classes.Professor;
import utils.Calculadora;

public class Main{
    public static void main(String[] args){
        Disciplina disciplinaMT = new Disciplina("Matemática");
        Disciplina disciplinaPT = new Disciplina("Português");

        Professor professorJoao = new Professor("João", 35, "2026070701", disciplinaPT);
        Professor professorPedro = new Professor("Pedro", 41, "2026070702", disciplinaMT);

        Aluno alunoWanderson = new Aluno("Wanderson", 25, "2026070701");
        Aluno alunoDavid = new Aluno("David", 28, "2026070702");

        Escola escolaAlbertoMa = new Escola("Escola Alberto Maranhão", "Rua exemplo");

        // Execução de Fato
        System.out.println(escolaAlbertoMa.matricularAluno(alunoWanderson));
        System.out.println(escolaAlbertoMa.matricularAluno(alunoDavid));

        System.out.println(escolaAlbertoMa.adicionarDisciplina(disciplinaMT));
        System.out.println(escolaAlbertoMa.matricularProfessor(professorPedro));
        System.out.println(escolaAlbertoMa.matricularProfessor(professorJoao));

        // declarando arrays
        int[] numeros;
        int[] numerosNewInt = new int[5];
        int[] numerosInit = new int[]{10, 11, 12, 13, 14, 15};

        // Wrapper - autoboxing e unboxing
        /*
         * Wrappers vem do verbo inglês “wrap” que significa envolver.
         * Eles são um nome adicional ao padrão de projeto Decorator.
         * Tem como principal função “envolver coisas”
         * adicionando funcionalidades à ela.
         */

        // primitivo    //wrapper
        //----------    //---------
        // boolean      Boolean
        // char         Character
        // int          Integer
        // double       Double

        // AUTOBOXING = Java converte automaticamente um tipo primitivo em um objeto Wrapper.
        int numeroSemWrapper = 1;
        Integer inteiroWrapper = numeroSemWrapper;

        // por baixo dos panos o java faz isso:
        // Integer inteiroWrapper = Integer.valueOf(numeroSemWrapper);

        // UNBOXING = Java converte automaticamente um objeto Wrapper em um tipo primitivo.
        int numeroUnboxing = inteiroWrapper;

        // Por baixo dos panos o java faz isso:
        // int numeroUnboxing = inteiroWrapper.intValue();
    }
}