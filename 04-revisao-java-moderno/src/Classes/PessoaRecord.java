package Classes;

/*
 * Record (Java 16+)
 *
 * Um record é um tipo especial de classe criado para representar
 * objetos que têm como principal finalidade armazenar dados
 * (Data Carrier / Data Class).
 *
 * Data Carrier = É um objeto criado apenas para transportar informações.
 *
 * Ao declarar um record, o compilador gera automaticamente:
 *
 * - atributos privados e finais (imutáveis);
 * - um construtor com todos os atributos;
 * - métodos de acesso (nome() e idade());
 * - equals() para comparação de objetos;
 * - hashCode() compatível com equals();
 * - toString() com uma representação textual do objeto.
 *
 * Um record é indicado quando o objeto apenas transporta informações,
 * sem possuir regras de negócio complexas ou estado mutável.
 *
 * Equivale a escrever uma classe tradicional com diversos métodos
 * repetitivos (boilerplate), deixando o código mais limpo e legível.
 *
 * Boilerplate = código que você escreve várias vezes, quase sempre da mesma forma (Olhe a class Pessoa).
 *
 * Por isso, o record é muito usado para:
 * DTO (Data Transfer Object)
 * respostas de APIs REST
 * parâmetros de métodos
 * retorno de consultas ao banco
 * troca de dados entre camadas da aplicação
 */
public record PessoaRecord(String nome, int idade) {

}
