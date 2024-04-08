import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // serialVersionUID é um atributo utilizado para controlar
        // explicitamente a compatibilidade
        // entre o .class usado para serializar e o
        // .class que será utilizado na desserialização.

        // IMPORTANTE: 1. As filhas de uma classe pai que implementa a interface Serializable também poderão ser serializadas.
        //             2. Atributos static não são serializados (pertencem à classe, não a um objeto individual).
        //             3. A definição da classe (tipo da classe, ex: "User") em si não é registrada, é necessário converter ex: (User).
        //             4. Os atributos declarados como "transient" não são serializados, são ignorados.
        //             5. serialVersionUID é um ID de versão exclusivo

        User user = null;

        FileInputStream fileIn = new FileInputStream("..\\serializacao\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);

        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

        // Exibindo serialVersionUID
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}