import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeiculoTest {

    @Test
    void deveRetornarValorVeiculo() {
        Veiculo veiculo = new VeiculoPopular(100000);
        assertEquals(100000, veiculo.getValor());
    }

    @Test
    void deveRetornarValorVeiculoComAr() {
        Veiculo veiculo = new ArCondicionado(new VeiculoPopular(100000));
        assertEquals(105000, veiculo.getValor());
    }
    @Test
    void deveRetornarValorVeiculoComVidro() {
        Veiculo veiculo = new VidroEletrico(new VeiculoPopular(100000));
        assertEquals(106000, veiculo.getValor());
    }

    @Test
    void deveRetornarValorVeiculoComArComVidro() {
        Veiculo veiculo = new VidroEletrico(new ArCondicionado(new VeiculoPopular(100000)));
        assertEquals(111000, veiculo.getValor());
    }

    @Test
    void deveRetornarAdicionalVeiculo() {
        Veiculo veiculo = new VeiculoPopular(100000);
        assertEquals("Veiculo Popular", veiculo.getAdicionais());
    }

    @Test
    void deveRetornarAdicionalVeiculoAr() {
        Veiculo veiculo = new ArCondicionado(new VeiculoPopular(100000));
        assertEquals("Veiculo Popular/Ar condicionado", veiculo.getAdicionais());
    }

    @Test
    void deveRetornarAdicionalVeiculoVidro() {
        Veiculo veiculo = new VidroEletrico(new VeiculoPopular(100000));
        assertEquals("Veiculo Popular/Vidro eletrico", veiculo.getAdicionais());
    }

    @Test
    void deveRetornarAdicionalVeiculoArEVidro() {
        Veiculo veiculo = new VidroEletrico(new ArCondicionado(new VeiculoPopular(100000)));
        assertEquals("Veiculo Popular/Ar condicionado/Vidro eletrico", veiculo.getAdicionais());
    }
}
