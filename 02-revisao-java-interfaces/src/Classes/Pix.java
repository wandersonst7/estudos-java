package Classes;

import interfaces.Pagamento;

// E se não quiser implementar pagamento? PODE!
// Basta tornar a classe abstrata:
// public abstract class Pix implements Pagamento
// Agora quem extender (herança) Pix será obrigado a implementar o método pagar

public class Pix implements Pagamento {
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
    }
}
