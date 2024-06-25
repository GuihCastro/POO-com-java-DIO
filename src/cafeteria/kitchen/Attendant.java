package cafeteria.kitchen;

public class Attendant {
	public void serveTable() {
		pickOrderAtTheCounter();
		System.out.println("Servindo a mesa...");
	}
	
	public void getSnackAtTheKitchen() {
		System.out.println("Pegando lanche na cozinha...");
	}
	
	public void receivePayment() {
		System.out.println("Recebendo pagamento...");
	}
	
	void switchGas() {
		System.out.println("Trocando o Gás...");
	}
	
	public void pickOrderAtTheCounter() {
		System.out.println("Pegando pedido no balcão...");
	}
}
