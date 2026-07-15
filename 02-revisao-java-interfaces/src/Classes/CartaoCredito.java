package Classes;

import interfaces.Pagamento;

public class CartaoCredito implements Pagamento {
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento de R$ " + valor + " realizado via Cartão de Crédito.");
    }
}
