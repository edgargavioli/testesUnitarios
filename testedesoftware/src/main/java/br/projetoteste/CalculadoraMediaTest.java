package br.projetoteste;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraMediaTest {

    @Test
    public void testMediaAprovado() {
        double nota1 = 8.0;
        double nota2 = 9.0;
        double nota3 = 7.5;
        double expectedMedia = 8.17;
        String expectedEstado = "aprovado";

        double media = (nota1 + nota2 + nota3) / 3;

        assertEquals("Test aprovado:",expectedMedia, media, 0.01);
        assertEquals(expectedEstado, calcularEstado(media));
    }

    @Test
    public void testMediaSegundaOportunidade() {
        double nota1 = 5.0;
        double nota2 = 4.0;
        double nota3 = 6.5;
        double expectedMedia = 5.17;
        String expectedEstado = "2° oportunidade";

        double media = (nota1 + nota2 + nota3) / 3;

        assertEquals("Teste 2° oportunidade",expectedMedia, media, 0.01);
        assertEquals(expectedEstado, calcularEstado(media));
    }

    @Test
    public void testMediaReprovado() {
        double nota1 = 3.0;
        double nota2 = 2.5;
        double nota3 = 3.5;
        double expectedMedia = 3.0;
        String expectedEstado = "reprovado";

        double media = (nota1 + nota2 + nota3) / 3;

        assertEquals("Teste reprovado",expectedMedia, media, 0.01);
        assertEquals(expectedEstado, calcularEstado(media));
    }

    private String calcularEstado(double media) {
        if (media >= 7) {
            return "aprovado";
        } else if (media >= 4 && media <= 6.9) {
            return "2ª oportunidade";
        } else {
            return "reprovado";
        }
    }
}
