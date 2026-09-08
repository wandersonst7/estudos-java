import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

// Anotations
// @Test - Marca um método como teste
// @DisplayName	- Define um nome descritivo para o teste
// @BeforeEach - Executa antes de cada teste
// @AfterEach - Executa depois de cada teste
// @BeforeAll - Executa uma vez antes de todos os testes
// @AfterAll - Executa uma vez depois de todos os testes
// @Disabled - Desabilita um teste
// @ParameterizedTest - Executa o mesmo teste várias vezes com parâmetros
// @ValueSource - Fornece valores para testes parametrizados
// @CsvSource - Fornece vários valores separados por vírgula
// @MethodSource - Obtém parâmetros a partir de um método

// Assertions
// assertEquals - Verifica igualdade - (esperado, resultado)
// assertNotEquals - Verifica diferença - (esperado, resultado);
// assertTrue - Espera true - (resultado true);
// assertFalse - Espera false - (resultado false);
// assertNull - Espera null - (resultado null);
// assertNotNull - Espera que não seja null - (resultado != null)
// *** assertThrows - Testa se determinado código lança uma exceção.

//assertThrows(
//        IllegalArgumentException.class,
//    () -> calculadora.dividir(10, 0)
//);
// IDEIA: "Espero que executar dividir(10, 0) lance IllegalArgumentException."

/* OBS:
------- @BeforeEach vs @BeforeAll ----------
BeforeEach - Executa antes de cada teste.
Se existem 3 testes ele faz isso:
@BeforeEach -> @Test 1 -> @BeforeEach -> @Test 2 -> @BeforeEach -> @Test 3

@BeforeAll - Executa apenas uma vez.
@BeforeAll -> @Test 1 -> @Test 2 -> @Test 3

@AfterEach e @AfterAll funciona da mesma maneira
@AfterEach = depois de cada teste
@AfterAll  = depois de todos os testes

*/

// fail() - força o teste a falhar.

// CONCEITOS
// Teste de software é a execução de um código de forma controlada
// para verificar se seu comportamento está de acordo com o esperado.

// Isolamento de testes: cada teste deve ser independente dos demais,
// possuindo seu próprio estado e não dependendo da ordem
// ou do resultado de outros testes.

// OUTROS CONCEITOS:
// JUnit Test Class - É a classe que contém os testes.
// JUnit Runner - é o componente responsável por executar os testes. (JUNIT 4) - (JUNIT5 usa JUnit Platform e engines)

// Setup e Teardown - São os procedimentos de preparação e limpeza dos testes.
// Setup - É preparar o ambiente antes do teste.

// ex:
// @BeforeEach
// void setup() {
//    calculadora = new Calculadora();
// }

// Teardown - É fazer a limpeza depois do teste.

// ex:
// @AfterEach
// void teardown() {
//    calculadora = null;
// }

class CalculadoraTest {

    private Calculadora calculadora;
    private static StringBuilder resultados = new StringBuilder();

    @BeforeEach
    void configuraCalculadora(){
        this.calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Teste de soma")
    void testSoma(){
        assertEquals(2, this.calculadora.somar(1,1));
        resultados.append("Teste de soma: PASSOU\n");
    }

    @Test
    @DisplayName("Teste de Desabilitado")
    @Disabled
    void testSub(){
//      Verifica igualdade: (esperado, resultado)
        assertEquals(1, this.calculadora.subtrair(2,1));
        resultados.append("Teste de Desabilitado: PASSOU\n");
    }

    @Test
    @DisplayName("Teste de Divisão Por Zero")
    void testDivisaoPorZero(){
        assertThrows(ArithmeticException.class, () -> this.calculadora.dividir(10,0));
        resultados.append("Teste de Divisão Por Zero: PASSOU\n");
    }

    @Test
    @DisplayName("Teste Falha Propositalmente")
    void testFalhaProposital(){
        fail();
        resultados.append("Teste Falha Propositalmente: PASSOU\n");
    }

    @ParameterizedTest
    @CsvSource({
            "1,3,2,2"
    })
    @DisplayName("Teste parametrizado maior valor")
    void testMaiorValor(int a, int b, int c, int d){
        assertEquals(3, this.calculadora.maiorValor(new int[]{a, b, c, d}));
        resultados.append("Teste parametrizado: PASSOU\n");
    }

    @AfterAll
    static void exportarResultados() {
        try (FileWriter arquivo = new FileWriter("resultado-testes.txt")) {
            arquivo.write("RESULTADO DOS TESTES\n");
            arquivo.write("====================\n\n");
            arquivo.write(resultados.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
