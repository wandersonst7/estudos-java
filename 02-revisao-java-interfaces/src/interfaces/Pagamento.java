package interfaces;

// Interfaces definem um CONTRATO.
// Elas dizem quais métodos uma classe DEVE implementar.

// Todo método sem corpo em uma interface é,
// implicitamente:
// public abstract
//
// Então escrever:
//
// void pagar(double valor);
//
// é exatamente igual a:
//
// public abstract void pagar(double valor);

// O compilador adiciona "public abstract" automaticamente.

// Pode existir atributo em interface? SIM
// Uma interface pode herdar várias interfaces? SIM
// Uma classe pode implementar várias interfaces? SIM

public interface Pagamento {
    double TAXA = 2.0;
    // isso é o mesmo que: public static final double TAXA = 2.5;

    void pagar(double valor);
    // isso é o mesmo que: public abstract void pagar(double valor);

    // pode ter metodo privado, isso faz com quem não seja obrigatório implementar na classe
    // OBS: somente método, interface não pode ter atributo privado.
    private void validar(){
        System.out.println("Validando...");
    }
}
