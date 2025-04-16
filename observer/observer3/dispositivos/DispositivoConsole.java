package observer3.dispositivos;

import observer3.observador.Observador;

public class DispositivoConsole implements Observador {

    @Override
    public void atualizar(double temperatura, double umidade) {
        System.out.println("Temperatura atual: " + temperatura + "°C");
        System.out.println("Umidade atual: " + umidade + "%");
    }
}
