import Classes.Boleto;
import Classes.CartaoCredito;
import Classes.Pix;
import interfaces.Pagamento;

public class Main {
    public static void main(String[] args) {

        // Pode instanciar?
        // Pagamento p = new Pagamento(); // ERRO

        Pagamento pagamento;

        // CONCEITO IMPORTARNTE SOBRE HERANÇA:
        // O objeto criado a partir da classe filha
        // é uma instância da classe filha e também pode ser tratado
        // como uma instância da superclasse ou da interface.
        //
        // A variável "pagamento" é do tipo Pagamento,
        // mas o objeto armazenado nela pode ser Pix,
        // CartaoCredito ou Boleto.

        pagamento = new Pix();
        pagamento.pagar(150);

        // O objeto implementa a interface Pagamento?
        System.out.println(
                "pagamento instanceof Pagamento: "
                        + (pagamento instanceof Pagamento));

        // O objeto é realmente um Pix?
        System.out.println(
                "pagamento instanceof Pix: "
                        + (pagamento instanceof Pix));

        pagamento = new CartaoCredito();
        pagamento.pagar(200);

        pagamento = new Boleto();
        pagamento.pagar(300);
    }
}