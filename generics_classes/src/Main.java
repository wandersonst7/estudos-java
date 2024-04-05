import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        /* Exemplo sem classes genéricas */
        MyIntegerClass myIntegerClass = new MyIntegerClass(10);
        MyStringClass myStringClass = new MyStringClass("Olá");
        System.out.println(myIntegerClass.getValue());
        System.out.println(myStringClass.getValue());

        /* Exemplos com classes genéricas */
        MyGenericClass<Integer> myGenericClass1 = new MyGenericClass<>(1);
        MyGenericClass<String> myGenericClass2 = new MyGenericClass<>("Olá");
        System.out.println("GenericValue 1: "+myGenericClass1.getValue());
        System.out.println("GenericValue 2: "+myGenericClass2.getValue());

        // Generics podem aceitar vários argumentos e tipos
        MyGenericClassMultiArguments<Integer, Double, String> multi = new MyGenericClassMultiArguments<>(1, 0.5, "OK");
        System.out.println("Valor Inteiro: "+multi.getValueT());
        System.out.println("Valor Decimal: "+multi.getValueE());
        System.out.println("String: "+multi.getValueI());

        // Tipos genericos do java
        ArrayList<String> myFriends = new ArrayList<>();

        // O HashMap em específico aceita dois argumentos genericos
        // Este exemplo: Integer=id do usuário, String=nome do usuário
        HashMap<Integer, String> users = new HashMap<>();

        // Você também pode criar classes genéricas
        // para tipos derivados. Exemplo: Números (decimal, inteiro etc)
        MyGenericClassNumber<Double> number = new MyGenericClassNumber<>(5.5);
        System.out.println("GenericNumber: "+number.getValue());
    }
}