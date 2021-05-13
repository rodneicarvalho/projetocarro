
import java.util.ArrayList;

public class GerenciarVeiculos {

    private final ArrayList automotores = new ArrayList();

    /**
     * Adiciona o veículo
     *
     * @param a
     */
    public void adicionar(Veiculo a) {

        this.automotores.add(a);

    }

    /**
     * Remove o veículo pela placa
     *
     * @param placa
     * @return
     */
    public boolean remover(String placa) {

        // iteração
        for (int i = 0; i <= this.automotores.size() - 1; i++) {

            // pega o veículo
            Veiculo v = (Veiculo) this.automotores.get(i);

            // valida as placas
            if (v.getPlaca().equals(placa)) {

                // remove pelo index
                this.automotores.remove(i);

            }

        }

        // retorno padrão
        return false;

    }

    /**
     * Busca o veiculo pela placa
     *
     * @param placa
     * @return
     */
    public Veiculo buscarPorPlaca(String placa) {

        // iteração
        for (int i = 0; i <= this.automotores.size() - 1; i++) {

            // pega o veículo
            Veiculo v = (Veiculo) this.automotores.get(i);

            // valida as placas
            if (v.getPlaca().equals(placa)) {

                // retorna o objeto veículo
                return v;

            }

        }

        // retorno padrão
        return null;

    }

    /**
     * Lista todos os veículos
     *
     * @return
     */
    public String listarVeiculos() {

        String retorno = "";

        // iteração
        for (int i = 0; i <= this.automotores.size() - 1; i++) {

            // pega o veículo
            Veiculo v = (Veiculo) this.automotores.get(i);

            // imprime os dados do veiculo
            retorno += v.imprimir();

        }

        // retorno
        return retorno;

    }

    /**
     * Retorna o valor do imposto pela placa
     *
     * @param placa
     * @return
     */
    public double obterValorImposto(String placa) {

        // iteração
        for (int i = 0; i <= this.automotores.size() - 1; i++) {

            // pega o veículo
            Veiculo v = (Veiculo) this.automotores.get(i);

            // valida as placas
            if (v.getPlaca().equals(placa)) {

                // retorna o objeto veículo
                return v.calcularImposto();

            }

        }

        // retorno padrão
        return -1;

    }

    /**
     * Lista os veículos pelo combustível
     *
     * @param combustivel
     * @return
     */
    public String listarVeiculoPorCombustivel(String combustivel) {

        String retorno = "";

        // iteração
        for (int i = 0; i <= this.automotores.size() - 1; i++) {

            // pega o veículo
            Veiculo v = (Veiculo) this.automotores.get(i);

            // valida combustivel
            if (v.getTipoCombustivel().equals(combustivel)) {

                // imprime os dados do veiculo
                retorno += v.imprimir();

            }

        }

        // retorno
        return retorno;

    }

}
