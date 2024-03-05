import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

//        double z = Math.max(x, y);
//        double z = Math.abs(y);
//        double z = Math.sqrt(y);

        double z = Math.round(x);
        System.out.println(z);

//        Exercício
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado a: ");
        a = scanner.nextDouble();

        System.out.println("Digite o lado b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a)+(y*y));

        System.out.println("A hipotenusa é: " + c);
        scanner.close();

    }
}