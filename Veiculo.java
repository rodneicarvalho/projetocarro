
import java.time.YearMonth;

public class Veiculo {

    private final String modelo;
    private final String marca;
    private final int anoFabricacao;
    private double valorMercado;
    private final String placa;
    private final String tipoCombustivel;

    /**
     * Construtor
     *
     * @param modelo
     * @param marca
     * @param anoFabricacao
     * @param valorMercado
     * @param placa
     * @param tipoCombustivel
     */
    public Veiculo(String modelo, String marca, int anoFabricacao, double valorMercado, String placa, String tipoCombustivel) {

        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.valorMercado = valorMercado;
        this.placa = placa;
        this.tipoCombustivel = tipoCombustivel;

    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    /**
     * Apenas o valor de mercado tem set
     *
     * @param valorMercado
     */
    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    /**
     * Calcula o valor do imposto do veículo
     *
     * @return
     */
    public double calcularImposto() {

        double porcentagemImposto;

        // ano atual
        int anoAtual = YearMonth.now().getYear();

        // valida tipos de combustivel
        switch (this.tipoCombustivel) {

            case "gasolina":
                porcentagemImposto = 4;
                break;

            case "diesel":
                porcentagemImposto = 4;
                break;

            case "flex":
                porcentagemImposto = 4;
                break;

            default:
                porcentagemImposto = 3;

        }

        // mais de 20 anos o imposto é zero
        if (anoAtual - this.anoFabricacao > 20) {

            porcentagemImposto = 0;

        }

        // valcula o valor do imposto
        double valorImposto = (this.valorMercado * porcentagemImposto) / 100;

        // retorno
        return valorImposto;

    }

    /**
     * Imprime os dados do veículo
     *
     * @return
     */
    public String imprimir() {

        String retorno = ""
                + "----------------------------------------------------------"
                + "\n"
                + "Modelo: " + this.modelo
                + "\n"
                + "Marca: " + this.marca
                + "\n"
                + "Ano: " + this.anoFabricacao
                + "\n"
                + "Valor de mercado R$: " + this.valorMercado
                + "\n"
                + "Placa: " + this.placa
                + "\n"
                + "Combustível: " + this.tipoCombustivel
                + "\n"
                + "Imposto sobre o valor: " + this.calcularImposto()
                + "\n"
                + "----------------------------------------------------------"
                + "\n"
                + "";

        // retorna
        return retorno;

    }

}
