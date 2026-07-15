package Classes;

/*
 * enum (Enumeration)
 *
 * Um enum é um tipo especial de classe utilizado para representar
 * um conjunto fixo e imutável de constantes relacionadas entre si.
 *
 * Diferente de uma classe comum, um enum possui uma quantidade
 * limitada de instâncias, definidas no momento da sua declaração.
 *
 * Cada constante de um enum é um objeto criado automaticamente
 * pelo Java durante a inicialização da aplicação.
 *
 * Um enum é indicado quando um valor só pode assumir uma das opções
 * previamente definidas, tornando o código mais seguro, legível e
 * evitando o uso de Strings ou números "mágicos".
 *
 * Apesar de representar constantes, um enum também pode possuir:
 * - atributos;
 * - construtores;
 * - métodos;
 * - implementar interfaces.
 *
 * Exemplos de uso:
 * - Dias da semana;
 * - Meses do ano;
 * - Status de pedidos;
 * - Estados de um processo;
 * - Formas de pagamento;
 * - Níveis de acesso.
 */

public enum DiaSemana {
    DOMINGO,
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO
}
