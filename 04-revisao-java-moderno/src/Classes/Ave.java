package Classes;

/*
 * Como Animal é uma classe sealed, toda subclasse permitida deve
 * obrigatoriamente ser declarada como:
 * - final
 * - sealed
 * - non-sealed
 *
 * Neste caso, "non-sealed" remove a restrição de herança imposta
 * por Animal, permitindo que qualquer outra classe possa herdar
 * de Ave.
*/

/*
 * A palavra-chave "non-sealed" torna esta classe aberta para herança.
 * Assim, embora apenas Ave possa herdar diretamente de Animal,
 * qualquer classe poderá herdar de Ave.
*/

public non-sealed class Ave extends Animal {
}
