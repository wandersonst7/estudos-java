package Classes;

/*
 * sealed, permits e non-sealed (Java 17+)
 *
 * A palavra-chave "sealed" é utilizada para restringir quais classes
 * ou interfaces podem herdar (extends) ou implementar (implements)
 * uma determinada classe ou interface.
 *
 * Diferente de uma classe comum, que pode ser estendida por qualquer
 * outra classe, uma classe sealed permite apenas as subclasses
 * explicitamente declaradas na cláusula "permits".
 *
 * Toda classe permitida deve obrigatoriamente ser:
 *
 * - final: impede novas heranças;
 * - sealed: continua restringindo a herança;
 * - non-sealed: libera novamente a herança.
 *
 * O objetivo é tornar a hierarquia de classes mais segura,
 * previsível e fácil de manter.
 */

/*
    * class = Qualquer classe pode herdar
    * final class = Ninguém pode herdar
    * sealed class = Apenas as classes autorizadas
*/

/*
 * - sealed:
 *   Restringe quem pode herdar (extends) ou implementar (implements)
 *   uma classe ou interface.
 *
 * - permits:
 *   Lista explicitamente quais classes ou interfaces estão
 *   autorizadas a herdar da classe ou interface sealed.
 *
 * - non-sealed:
 *   Remove a restrição imposta por uma classe sealed, permitindo
 *   novamente que outras classes possam herdar dessa subclasse.
 */

public sealed class Animal permits Mamifero, Ave{
}
