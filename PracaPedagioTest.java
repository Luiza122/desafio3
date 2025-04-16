import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PracaPedagioTest {

    @Test
    public void testCalculoMoto() {
        PracaPedagio praca = new PracaPedagio("Teste", 10.0);
        Veiculo moto = new Veiculo("XYZ1234", "moto", 0);
        assertEquals(5.0, praca.calcularValor(moto));
    }

    @Test
    public void testCalculoCaminhao() {
        PracaPedagio praca = new PracaPedagio("Teste", 10.0);
        Veiculo caminhao = new Veiculo("CAM1111", "caminhão", 3);
        assertEquals(30.0, praca.calcularValor(caminhao));
    }

    @Test
    public void testCalculoCarro() {
        PracaPedagio praca = new PracaPedagio("Teste", 10.0);
        Veiculo carro = new Veiculo("CAR1234", "carro", 0);
        assertEquals(10.0, praca.calcularValor(carro));
    }
}