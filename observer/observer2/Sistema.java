package observer2;


public class Sistema {

	public static void main(String[] args) {

		Suporte suporte = new Suporte();
		
		AnalistaChefe chefe = new AnalistaChefe();
		Tecnico tec1 = new Tecnico("Xico", "SistemaX");
		Tecnico tec2 = new Tecnico("Joca", "SistemaY");

		// Registrar os observadores no Suporte
		suporte.registrarObservador(chefe);
		suporte.registrarObservador(tec1);
		suporte.registrarObservador(tec2);

		suporte.enviarMensagem(new Cliente("AAA"), "Meu Windows nao funciona");
		suporte.enviarMensagem(new Cliente("BBB"), "Nao consigo entrar no SistemaX");
		suporte.enviarMensagem(new Cliente("CCC"), "Erro no SistemaY com impressao");
		
	}

}
