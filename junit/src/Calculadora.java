public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero");
        }
        return (double) a / b;
    }

    public boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public double calcularMedia(double[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException("A lista de notas não pode estar vazia");
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public int maiorValor(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("A lista de números não pode estar vazia");
        }
        int maior = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }
}
