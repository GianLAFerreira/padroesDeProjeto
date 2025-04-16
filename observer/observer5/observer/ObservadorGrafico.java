package observer5.observer;

import javax.swing.*;

public class ObservadorGrafico implements Observador{

    private JLabel jLabelStatus;

    public ObservadorGrafico(JLabel jLabelStatus) {
        this.jLabelStatus = jLabelStatus;
    }

    @Override
    public void atualizar(int quantidadeAtual, int quantidadeCritica, int quantidadeMaxima) {
        if (quantidadeAtual <= quantidadeCritica) {
            jLabelStatus.setText("Atenção: Estoque crítico!");
        } else if (quantidadeAtual >= quantidadeMaxima) {
            jLabelStatus.setText("Atenção: Estoque cheio!");
        } else {
            jLabelStatus.setText("Estoque em níveis normais.");
        }
    }

}
