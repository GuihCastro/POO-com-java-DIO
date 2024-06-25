package cafeteria.kitchen;

public class Warehouseman {
	private void controlEntry() {
		System.out.println("Controlando a entrada dos itens...");
	}
	
	private void controlOutput() {
		System.out.println("Controlando a saída dos itens...");
	}
	
	void deliverIngredients() {
		System.out.println("Entregando ingredientes...");
		controlOutput();
	}
	
	void switchGas() {
		System.out.println("Trocando o gás...");
	}
}
