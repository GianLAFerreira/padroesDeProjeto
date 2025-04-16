package observer5.observer;

public class ObservadorConsole implements Observador {

    @Override
    public void atualizar(int quantidadeAtual, int quantidadeCritica, int quantidadeMaxima) {
        System.out.println("Quantidade Atual: " + quantidadeAtual);
        System.out.println("Quantidade Crítica: " + quantidadeCritica);
        System.out.println("Quantidade Máxima: " + quantidadeMaxima);

        if (quantidadeAtual <= quantidadeCritica) {
            System.out.println("Atenção: Estoque atingiu a quantidade crítica!");
        } else if (quantidadeAtual >= quantidadeMaxima) {
            System.out.println("Atenção: Estoque atingiu a capacidade máxima!");
        }
    }
}
