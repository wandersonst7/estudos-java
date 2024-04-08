import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
            Serialização é a técnica que permite
            transformar um objeto em uma sequência bytes.
            (pense nisso como se você estivesse
            salvando um arquivo com as informações do objeto)
        */

        /*
            Deserialização é a técnica que permite
            transformar uma sequência bytes em um objeto.
            (pense nisso como se você estivesse carregando um arquivo salvo)
        */

        User user = new User();
        user.name = "wanderson_st7";
        user.password = "12345678";

        // Serializando objeto em um arquivo
        // (pode ser encontrado na raiz do projeto)
        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Informação do objeto usuário salva!");

        // Exibindo serialVersionUID
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

    }
}