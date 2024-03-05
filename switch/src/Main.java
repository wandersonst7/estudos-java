public class Main {
    public static void main(String[] args) {

        String dia = "Sexta";

        switch (dia){
            case "Domingo":
                System.out.println("Hoje é Domingo");
                break;
            case "Segunda":
                System.out.println("Hoje é Segunda");
                break;
            case "Terça":
                System.out.println("Hoje é Terça");
                break;
            case "Quarta":
                System.out.println("Hoje é Quarta");
                break;
            case "Quinta":
                System.out.println("Hoje é Quinta");
                break;
            case "Sexta":
                System.out.println("Hoje é Sexta");
                break;
            case "Sábado":
                System.out.println("Hoje é Sexta");
                break;
            default:
                System.out.println(dia + " não é um dia");
        }

        /*

        * Outra variação

        switch (dia) {
            case "Domingo" -> System.out.println("Hoje é Domingo");
            case "Segunda" -> System.out.println("Hoje é Segunda");
            case "Terça" -> System.out.println("Hoje é Terça");
            case "Quarta" -> System.out.println("Hoje é Quarta");
            case "Quinta" -> System.out.println("Hoje é Quinta");
            case "Sexta" -> System.out.println("Hoje é Sexta");
            case "Sábado" -> System.out.println("Hoje é Sexta");
        }

        */
    }
}