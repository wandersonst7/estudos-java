public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // for aninhado
        for(int i = 0; i < 5; i++){
            System.out.print("Posição i: " + i + " - ");

            for(int j = 1; j<5; j++){
                System.out.print(j);
            }

            System.out.println("");
        }

        // for aprimorado
        /*

            for(<Tipo> <identificação> : <array ou coleção>) {
                <comando>
            }

         */
        int[] array = {1,2,3,4,5};
        for(int i : array){
            System.out.println(i);
        }

    }
}