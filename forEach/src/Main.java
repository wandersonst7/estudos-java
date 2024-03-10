import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        String[] animais = {"Gato", "Cachorro", "Rato", "Passaro"};
        ArrayList<String> animais = new ArrayList<>();
        animais.add("Gato");
        animais.add("Cachorro");
        animais.add("Rato");
        animais.add("Passaro");

        /*
            for(<Tipo> <identificação> : <array ou coleção>) {
                <comando>
            }
         */

        for(String animal : animais){
            System.out.println(animal);
        }

    }
}