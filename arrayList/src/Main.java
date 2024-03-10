import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
            * ArrayList é um array redimensionável
            que pode ser encontrado no pacote java.util.

            * Elementos podem ser adicionados ou removidos
            em tempo de execução

            * Necessário especificar o tipo do ArrayList
         */

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Fiat");

        // "get" pega um elemento do array fornecendo um índice
        System.out.println(cars.get(0));

        // "set" substitui um item, fornecendo um index
        cars.set(0, "Tesla");

        // "remove" remove um item
        cars.remove(2);

        // "size" pega o tamanho do ArrayList
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

    }
}