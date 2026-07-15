package principio_dip;

public class Carro {
    private Engine engine;

    public Carro(Engine e){
        engine = e;
    }

    public void start(){
        engine.start();
    }
}
