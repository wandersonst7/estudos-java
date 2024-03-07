

public class Main {
    public static void main(String[] args) {

//        String[] exemploDeclaracao = new String[10];
//        String[] exemploDeclaração2;

        String[] carros = {"Camaro", "Corvette", "Tesla"};
        carros[0] = "Mustang";

        for(int i = 0; i < carros.length; i++){
            System.out.println(carros[i]);
        }

//        for(String car : carros){
//            System.out.println(car);
//        }


        // 2D Arrays
//        String[][] exemploDeclaracao3 = new String[3][3];
//        String[][] exemploDeclaracao4;

        String[][] frutas = {
                {"Banana", "Goiaba", "Laranja"},
                {"Mamão", "Kiwi", "Morango"},
                {"Maça", "Limão", "Melancia"}
        };


        for(int j = 0; j < frutas.length; j++){
            System.out.print("Frutas["+j+"] -> { ");
            for(int k = 0; k < frutas[j].length; k++){

                if(k == (frutas[j].length-1)){
                    System.out.print(frutas[j][k]);
                }else{
                    System.out.print(frutas[j][k] + ", ");
                }

            }
            System.out.println(" }");
        }
    }

}