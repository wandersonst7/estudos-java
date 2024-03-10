public class Main {
    public static void main(String[] args) {

        /*
         * Wrappers vem do verbo inglês “wrap” que significa envolver.
         * Eles são um nome adicional ao padrão de projeto Decorator.
         * Tem como principal função “envolver coisas”
         * adicionando funcionalidades à ela.
         */

        // primitivo    //wrapper
        //----------    //---------
        // boolean      Boolean
        // char         Character
        // int          Integer
        // double       Double

        // autoboxing = o próprio Java já converte o
        // tipo primitivo em Wrapper se este achar que é necessário.

        // unboxing = é quando você deseja converter
        // um objeto para um tipo primitivo.
        boolean exUboxing = Boolean.parseBoolean("true");
        System.out.println(exUboxing);

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        // Convertendo
        String conversao = String.valueOf(c);
        System.out.println(conversao);

        if(a.equals(Boolean.TRUE)){
            System.out.println("É verdadeiro");
        }


    }
}