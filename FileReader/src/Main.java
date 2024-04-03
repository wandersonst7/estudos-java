import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File file = new File("mensagem_secreta.txt");

        // pode gerar exceções
        try{
            FileReader reader = new FileReader(file.getName());

            int data = reader.read();

            while(data != -1){
                System.out.print((char) data);
                data = reader.read();
            }

            reader.close();

        }catch (IOException e){
            e.printStackTrace();

            /*
            Como funciona o método printStackTrace()?
                Durante sua execução, um método pode chamar outros métodos, que por sua vez podem
                chamar outros métodos e assim por diante. Por exemplo, considere que um método A()
                chama o método B(), que chama o método C(), que chama o método D(). A máquina virtual
                Java armazena as chamadas de métodos que encontram-se em execução em uma estrutura de
                dados denominada Pilha de Execução (ou Stack).

                Quando um método termina sua execução, a informação sobre esse método é removida da
                pilha de execução e o método que havia chamado esse método que terminou pode continuar
                sua execução.

                Quando ocorre uma exceção, uma informação de
                interesse é saber quais eram os métodos que estavam sendo executados naquele momento.
                Essa informação é interessante para reconstituir o ambiente computacional em que o erro
                ocorreu, de modo a entender a situação e poder encontrar uma forma de corrigir o erro.
                Para obter essa informação, basta percorrer a pilha de execução, operação conhecida como
                StackTrace. Portanto, o método printStackTrace() serve para exibir o conteúdo da pilha de
                execução quando ocorre uma exceção.

             */
        }

    }

}