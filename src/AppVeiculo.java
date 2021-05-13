
import java.util.Scanner;

public class AppVeiculo {

    private static GerenciarVeiculos gerencia;

    /**
     * Add veiculo
     */
    private static void addVeiculo() {

        Scanner in = new Scanner(System.in);

        System.out.println("Modelo: ");
        String modelo = in.nextLine();

        System.out.println("Marca: ");
        String marca = in.nextLine();

        System.out.println("Ano: ");
        int anoFabricacao = Integer.valueOf(in.nextLine());

        System.out.println("Valor R$: ");
        double valorMercado = Double.valueOf(in.nextLine());

        System.out.println("Placa: ");
        String placa = in.nextLine();

        System.out.println("Combustivel: ");
        String tipoCombustivel = in.nextLine();

        // cria e adiciona
        Veiculo veiculo = new Veiculo(modelo, marca, anoFabricacao, valorMercado, placa, tipoCombustivel);
        gerencia.adicionar(veiculo);

    }

    /**
     * Menu de opções
     */
    private static void menu() {

        // menu
        Scanner menu = new Scanner(System.in);

        // opções
        String opcoes = ""
                + "1 - Novo veiculo"
                + "\n"
                + "2 - Remover veiculo pela placa"
                + "\n"
                + "3 - Buscar veiculo pela placa"
                + "\n"
                + "4 - Listar todos os veiculos"
                + "\n"
                + "5 - Valor do imposto do veiculo pela placa"
                + "\n"
                + "6 - Buscar veiculo por combustivel"
                + "\n"
                + "";

        // exibe opções
        System.out.println(opcoes);

        // seleciona uma opção
        switch (menu.nextInt()) {

            case 1:
                addVeiculo();
                break;

            case 2:
                System.out.println("Placa: ");
                gerencia.remover(menu.next());
                break;

            case 3:
                System.out.println("Placa: ");
                System.out.println(gerencia.buscarPorPlaca(menu.next()).imprimir());
                break;

            case 4:
                System.out.println(gerencia.listarVeiculos());
                break;

            case 5:
                System.out.println("Placa: ");
                System.out.println(gerencia.obterValorImposto(menu.next()));
                break;

            case 6:
                System.out.println("Combustivel: ");
                System.out.println(gerencia.listarVeiculoPorCombustivel(menu.next()));
                break;

        }

        System.out.println("\n");

        // repete o menu
        while (menu.hasNextLine()) {

            menu();

        }

    }

    public static void main(String[] args) {

        // gerencia veiculos
        gerencia = new GerenciarVeiculos();

        // menu
        menu();

    }

}
