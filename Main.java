public class Main {
    public static void main(String[] args) {
        PracaPedagio praca1 = new PracaPedagio("Anhanguera - KM 100", 10.0);

        Veiculo carro = new Veiculo("ABC1234", "carro", 0);
        Veiculo moto = new Veiculo("XYZ5678", "moto", 0);
        Veiculo caminhao = new Veiculo("CAM8901", "caminhão", 4);

        praca1.registrarPassagem(carro);
        praca1.registrarPassagem(moto);
        praca1.registrarPassagem(caminhao);

        praca1.gerarRelatorio();
    }
}