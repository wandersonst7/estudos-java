package Classes;

import interfaces.Pagamento;

public class CartaoDebito implements Pagamento {
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento de R$ " + valor + " realizado via Cartão de Débito.");
    }
}
