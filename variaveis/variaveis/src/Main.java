public class Main{

    /*
        O parâmetro "String[] args" é utilizado no método "main"
        em Java para receber argumentos da linha de comando.
        Esses argumentos podem ser úteis para fornecer informações
        adicionais ao programa durante a execução, como a configuração do programa ou a especificação de um arquivo de entrada.
     */

    /*
        -boolean (Primitivo)
        -byte (Primitivo)
        -short (Primitivo)
        -int (Primitivo)
        -long (Primitivo)

        -float (Primitivo)
        -double (Primitivo)

        -char (Primitivo)

        Os tipos por referência, são classes que especificam os tipos de objeto.
        -String
        -Arrays Primitivos
        -Objetos

     */

    public static void main(String[] args){

        /*
            Identificação no Final:
            float = "f"
            long = "L"
         */

        boolean boole = false;
        System.out.println("O valor de boolean é: " + boole);

        byte b = 127;
        System.out.println("O valor de byte é: " + b);

        short s = 10003;
        System.out.println("O valor de short é: " + s);

        int x = 123;
        System.out.println("O valor de int é: " + x);

        long l = 12314901284120012L;
        System.out.println("O valor de long é: "+ l);

        float f = 3.14f;
        System.out.println("O valor de float é: "+ f);

        double d = 3.14;
        System.out.println("O valor de double é: "+ d);

        char c = '@';
        System.out.println("O valor do char é: "+ c);

        String name = "Wanderson";
        System.out.printf("O valor da String é: %s\n", name);

    }
}