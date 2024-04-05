import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
            *  Generic que permite escrever códigos mais seguros e fáceis de ler
            *  pelo fato de utilizar menos cast (conversão de um objeto em outro).
         */

        /*
               * Caso algum erro de cast ocorra, só veremos em tempo de execução,
               * pois este cast só será feito assim que este determinado
               * trecho do código for executado.

               * Diferente do Generics, que o erro é em tempo de compilação,
               * ou seja, já nos deparamos com o erro antes mesmo de
               * tentar executar o projeto

               * Podemos também utilizar os Generics em Classes ou Interfaces

         */

        /* Exemplo método sem generics */
        Integer[] arrayInt = {1, 2, 3, 4, 5};
        Double[] arrayDouble = {1.5, 2.5, 3.5, 4.5, 5.5};
        String[] arrayString = {"Hello", "World"};
        displayArray(arrayInt);
        displayArray(arrayDouble);

        /* Exemplo método com generics */
        displayArrayGeneric(arrayString);
        displayArrayGeneric(arrayInt);

        System.out.println(getFirst(arrayDouble));
        System.out.println(getFirst(arrayString));
    }

    public static <AlgumaCoisa> AlgumaCoisa getFirst(AlgumaCoisa[] array){
        return array[0];
    }

    public static <AlgumaCoisa> void displayArrayGeneric(AlgumaCoisa[] array){
        for(AlgumaCoisa x: array){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void displayArray(Integer[] array){
        for(Integer x: array){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void displayArray(Double[] array){
        for(Double x: array){
            System.out.print(x+" ");
        }
        System.out.println();

    }

}