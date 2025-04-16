import java.util.ArrayList;
import java.util.List;

public class PracaPedagio {
    private String localizacao;
    private double tarifaBase;
    private List<RegistroPassagem> registros = new ArrayList<>();

    public PracaPedagio(String localizacao, double tarifaBase) {
        this.localizacao = localizacao;
        this.tarifaBase = tarifaBase;
    }

    public void registrarPassagem(Veiculo veiculo) {
        double valor = calcularValor(veiculo);
        registros.add(new RegistroPassagem(veiculo, valor));
    }

    public double calcularValor(Veiculo veiculo) {
        switch (veiculo.getTipo()) {
            case "moto":
                return tarifaBase * 0.5;
            case "caminhão":
                return tarifaBase * veiculo.getEixos();
            case "carro":
            default:
                return tarifaBase;
        }
    }

    public void gerarRelatorio() {
        System.out.println("📍 Praça de Pedágio: " + localizacao);
        double total = 0;
        for (RegistroPassagem r : registros) {
            System.out.println("Veículo: " + r.getVeiculo().getPlaca() + " | Tipo: " + r.getVeiculo().getTipo() + " | Valor: R$" + r.getValorCobrado());
            total += r.getValorCobrado();
        }
        System.out.println("💰 Total arrecadado: R$" + total);
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
