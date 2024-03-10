import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> foods = new ArrayList<>();
        foods.add("Arroz");
        foods.add("Feijão");
        foods.add("Carne");

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coca-cola");
        drinks.add("Café");
        drinks.add("Suco");

        System.out.println("Comidas:" + foods);
        System.out.println("Bebidas" + drinks);

        ArrayList<ArrayList<String>> products = new ArrayList<>();
        products.add(foods);
        products.add(drinks);

        System.out.println("Produtos: " + products);
        System.out.println("Primeiro produto de \"comida\": " + products.get(0).get(0));

    }
}