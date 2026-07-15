package principio_dip;

/*
    D - Princípio da Inversão de dependência
    Esse princípio afirma que, primeiro, módulos de alto nível
    não devem depender de módulos de baixo nível,
    eles devem depender de abstrações; e segundo que as abstrações
    não devem depender de detalhes; detalhes devem depender de abstrações.

    A ideia é que isolemos nossa classe atrás de um limite formado
    pelas abstrações que dela dependem. Se os detalhes por trás
    dessas abstrações mudarem, nossa classe ainda continuará segura.
    Isso ajuda a manter o acoplamento baixo,
    além de tornar nosso projeto mais fácil de ser alterado,
    permitindo testar coisas isoladamente.
*/

/*
    O código irá funcionar, mas e se quisermos adicionar outro tipo de motor,
    digamos um motor a diesel? Isso exigirá a refatoração da classe Carro.
    No entanto, podemos resolver isso adicionando uma camada de abstração,
    utilizando uma interface.
*/

public class CarroErrado {
    private EngineErrada engine;

    public CarroErrado(EngineErrada e){
        engine = e;
    }

    public void start(){
        engine.start();
    }
}
