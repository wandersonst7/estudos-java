package Utils;

public class Yield {
    /*
     * yield (Java 14+)
     *
     * A palavra-chave yield é utilizada dentro de um switch expression
     * para retornar um valor quando o case possui um bloco de código.
     *
     * Antes do Java moderno, o switch era apenas uma estrutura de controle
     * de fluxo e utilizava a palavra-chave break para encerrar um case.
     *
     * Com o switch expression, o switch também pode produzir um valor.
     * Quando o case possui apenas uma expressão, utiliza-se a sintaxe "->".
     * Quando o case possui várias instruções, utiliza-se um bloco "{}"
     * e a palavra-chave yield para retornar o resultado daquele bloco.
     *
     * Em outras palavras:
     * - break encerra um case;
     * - yield retorna um valor do switch.
     */

    public static void switchComum(int numero){
        String dia;

        switch (numero) {
            case 1:
                dia = "Domingo";
                break;

            case 2:
                dia = "Segunda";
                break;

            default:
                dia = "Outro";
        }

        /*
            * Observe que você precisa:
            * declarar a variável antes;
            * atribuir o valor em cada case;
            * usar break.
        */

        System.out.println("Dia (antes do yield)" + dia);
    }

    public static void switchAprimorado(int numero){
        // Switch Aprimorado
        String dia = switch (numero) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            default -> "Outro";
        };

        /*
            * Perceba que não existe mais break.
            * O próprio switch devolve o resultado.
        */

        System.out.println("Dia (depois do Yield)" + dia);
    }

    public static void usoDoYield(int numero){
        /* Quando entra o yield?
             * Quando você precisa executar mais de uma instrução.
             * Sem yield isso não compila:
        */

        /*
            String dia = switch (numero) {
                case 2 -> {
                  System.out.println("Executando...");
                   "Segunda"; // ERRO AQUI
               }
               default -> "Outro";
            };
        */

        // O compilador reclama porque o bloco precisa devolver um valor.

        // Então usamos yield:
        String dia = switch (numero) {
            case 2 -> { // executamos o bloco e devolvemos um valor com yield
                System.out.println("Executando...");
                yield "Segunda";
            }

            default -> "Outro";
        };

        System.out.println("usoDoYield: " + dia);
    }
}
