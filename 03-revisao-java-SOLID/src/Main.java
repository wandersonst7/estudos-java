import principio_dip.*;
import principio_lsp.A;
import principio_lsp.B;
import principio_ocp.ContratoClt;
import principio_ocp.Estagio;
import principio_ocp.FolhaPagamento;

public class Main{
    public static void main(String[] args){
        /*
             SOLID refere-se a cinco princípios de design em POO identificados por Robert C.Martin (conhecido na comunidade como Uncle Bob) por volta dos anos 2000.  Mas foi Michael Feather que criou o acrônimo após observar que esses princípios poderiam se encaixar em um único termo: SOLID.
         */

        /*
            * Single Responsibility Principle (Princípio da Responsabilidade Única);
            * Open Close Principle (Princípio Aberto Fechado);
            * Liskov Substitution Principle (Princípio da substituição de Liskov);
            * Interface Segregation Principle (Princípio da Segregação da Interface);
            * Dependency Inversion Principle (Princípio da Inversão de dependência)
        */


        // OPEN CLOSED
        Estagio joao = new Estagio("Joao", "Ajudante");
        ContratoClt felipe = new ContratoClt("Pedro", "Programador");

        // Errado
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        folhaPagamento.calcular(joao);
        System.out.println(folhaPagamento.getSaldo());

        // Certo
        folhaPagamento.calcularOCP(felipe);
        System.out.println(folhaPagamento.getSaldo());

        // Liskov Substitution
        /*
            L - Princípio da substituição de Liskov
            Classes derivadas podem ser substitutas de suas classes base, ou ainda:
            toda e qualquer classe derivada pode ser usada como se fosse a classe base.
         */

        /*
            Por que esse princípio é necessário? Atendendo a esse princípio,
            você garante que a classe derivada seja usada de forma transparente
            onde a classe base é vista. Assim, todo código que depende da classe base
            poderá usar qualquer uma das derivadas em tempo de execução
            mesmo sem saber da existência delas.
         */

        A obj1 = new A();
        B obj2 = new B();
        imprimeNome(obj2);

        // DIP

        //Errado
        EngineErrada engineErrada = new EngineErrada();
        CarroErrado carroErrado = new CarroErrado(engineErrada);
        carroErrado.start();

        /*
            O código irá funcionar, mas e se quisermos adicionar outro tipo de motor,
            digamos um motor a diesel? Isso exigirá a refatoração da classe Carro.
            No entanto, podemos resolver isso adicionando uma camada de abstração,
            utilizando uma interface.
        */

        // Certo
        PetroleoEngine petroleoEngine = new PetroleoEngine();
        Carro carroPetroleo = new Carro(petroleoEngine);
        carroPetroleo.start();

        DieselEngine dieselEngine = new DieselEngine();
        Carro carroDiesel= new Carro(dieselEngine);
        carroDiesel.start();

    }

    public static void imprimeNome(A obj){
        System.out.println(obj.getNome());
    }
}