public class Main {
    public static void main(String[] args) {

        // expressão = operandos & operadores
        // operandos = valores, variáveis, números, quantidade
        // operadores = + - * / %

        int friends = 10;
        friends++;
        friends--;

        /*
            Casting

            O cast é uma conversão, é quando convertemos
            um valor de um tipo para outro tipo.

            No exemplo abaixo estamos convertendo o resultado
            de uma divisão inteira para double (para ter mais precisão)
         */

        double result = (double) friends / 3;
        System.out.println(result);

        System.out.println(friends);

    }

}