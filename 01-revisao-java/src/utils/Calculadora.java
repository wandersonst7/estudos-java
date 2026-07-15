package utils;

public class Calculadora {
    // construtor privado porque não faz sentido deixar
    // instanciar a classe utilitária
    private Calculadora() {}

    public static int somar(int a, int b) {
        return a + b;
    }
}