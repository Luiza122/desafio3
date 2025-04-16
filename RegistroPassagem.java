public class RegistroPassagem {
    private Veiculo veiculo;
    private double valorCobrado;

    public RegistroPassagem(Veiculo veiculo, double valorCobrado) {
        this.veiculo = veiculo;
        this.valorCobrado = valorCobrado;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }
}
