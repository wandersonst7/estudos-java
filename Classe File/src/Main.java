import java.io.File;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        // file = representação abstrata de nomes de
        // caminhos de arquivos e diretórios

        File file = new File("mensagem_secreta.txt");
        File arquivoAreaTrabalho = new File("C:\\Users\\Wanderson\\Desktop\\mensagem_secreta 2.txt");

        // Arquivo da pasta do projeto
        if(file.exists()){
            System.out.println("O arquivo existe.");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }else{
            System.out.println("O arquivo não existe.");
        }

        // Arquivo da área de trabalho
        if(arquivoAreaTrabalho.exists()){
            System.out.println("O arquivo existe.");
        }else{
            System.out.println("O arquivo não existe.");
        }

    }

    /*

    Objetos dessa classe irão servir para objetos de outras classes da java.io package.
    Usamos ela para obter informações SOBRE o arquivo ou diretório/pasta, e não sobre seu conteúdo.

    Ao contrário de outras classe e do que o nome possa sugerir, essa classe não abre,
    ou permite o processamento de conteúdo de um arquivo. A sua função está relacionada
    com o caminho / diretório / endereço dos arquivos ou diretório que desejarmos manipular.
    Ela provém, diversos métodos para checagem de existência de arquivos ou diretórios,
    se é um ou outro, o tamanho do arquivo, a última vez que foi alterado,
    se é possível escrever ou lê-lo, etc. Adiante explicarei mais detalhadamente
    alguns dos métodos da classe File.

    Dentre os argumentos passados para o constructor de um File object, destacamos:
    path -> é o caminho do arquivo ou diretório
    absolute path -> todos os diretórios, começando pelo do root, até o arquivo ou diretório de interesse
    relative path -> começa no diretório onde a aplicação é executada, que é parente do diretório atual
    URL -> endereço na web, Uniform Resource Locators
    URI -> endereço no computador, Uniform Resource Identifier. Como o '/home/ProgramacaoProgressiva/'
    ou 'C:/windows/forever alone' caso ainda esteja no caminho das trevas

    Alguns métodos da classe File:
    boolean canRead() -> retorna true se for possível ler o arquivo, falso o contrário
    boolean canWrite() -> retorna true se for possível escrever no arquivo, falso o contrário
    boolean exists() -> retorna true se o diretório ou arquivo se o objeto File existe, falso o contrário
    boolean isFile() -> retorna true se o argumento passado ao construtor da File é um arquivo, falso o contrário
    boolean isDirectory() -> retorna true se o argumento passado ao construtor da File é um diretório, falso o contrário
    boolean isAbsolute() -> retorna true para caso o argumento seja de um caminho absoluto, falso o contrário
    String getAbsolutePath() -> retorna uma String com o caminho absoluto do diretório ou arquivo
    String getName() -> retorna uma String com o nome do arquivo ou do diretório
    String getPath() -> retorna uma Sting com o caminho do arquivo ou diretório
    String getParent() -> retorna uma String com o caminho do diretório pai (acima;anterior) ao do arquivo ou diretório atual
    long length() -> retorna um tamanho, em bytes, do arquivo ou inexistente, caso seja diretório
    long lastModified() -> retorna o tempo em que o arquivo ou diretório foi modificado pela última vez; varia de acordo com o sistema
    String[] list() -> retorna um array de Strings com o conteúdo do diretório, ou null se for arquivo

     */

}