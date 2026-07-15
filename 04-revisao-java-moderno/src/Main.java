import Classes.*;
import Utils.Yield;

public class Main {
    public static void main(String[] args) {
        // record, yield, sealed, permits, non-sealed, enum

        // * record
        Pessoa pessoa = new Pessoa("João", 25); // classe normal
        PessoaRecord pessoaRecord = new PessoaRecord("João", 25); // record
        System.out.println(pessoa.getNome()); // classe normal
        System.out.println(pessoaRecord.idade()); // record

        // * yield
        Yield.switchComum(1);
        Yield.switchAprimorado(2);
        Yield.usoDoYield(2);

        // * sealed / permits / non-sealed
        Animal animal = new Animal();

        // funciona por 2 motivos: Leao é um Mamífero e Mamífero é um Animal
        Animal leao = new Leao();

        // * enum
        DiaSemana hoje = DiaSemana.SEGUNDA;
        System.out.println(hoje);

        /*
         * ============================================================
         * Recursos modernos do Java
         * ============================================================
         *
         * record
         *   - Cria classes simples e imutáveis para armazenar dados.
         *   - Exemplo:
         *       record Pessoa(String nome, int idade) {}
         *
         * sealed
         *   - Restringe quais classes podem herdar de uma classe.
         *   - Exemplo:
         *       sealed class Animal permits Cachorro, Gato {}
         *
         * permits
         *   - Lista as subclasses autorizadas de uma classe sealed.
         *   - Exemplo:
         *       permits Cachorro, Gato
         *
         * non-sealed
         *   - Permite que uma subclasse volte a ser herdada livremente.
         *   - Exemplo:
         *       non-sealed class Cachorro extends Animal {}
         *
         * final
         *   - Impede que uma classe seja herdada.
         *   - Exemplo:
         *       final class Cachorro extends Animal {}
         *
         * yield
         *   - Retorna um valor de um bloco switch.
         *   - Exemplo:
         *       yield "Muito Bom";
         *
         * enum
         *   - Representa um conjunto fixo de constantes.
         *   - Exemplo:
         *       enum DiaSemana { SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO }
         *
         * ============================================================
         */
    }
}