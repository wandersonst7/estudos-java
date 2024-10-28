package principio_lsp;

/*
    L - Princípio da substituição de Liskov
    Classes derivadas podem ser substitutas de suas classes base, ou ainda:
    toda e qualquer classe derivada pode ser usada como se fosse a classe base.
 */

public class A {
    public String getNome(){
        return "Meu nome é A";
    }
}
