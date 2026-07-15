package Classes;

import interfaces.Pagamento;

public class Boleto implements Pagamento {
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento de R$ " + valor + " realizado via boleto.");
    }
}
