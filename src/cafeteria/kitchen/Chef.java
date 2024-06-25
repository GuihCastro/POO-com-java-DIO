package cafeteria.kitchen;

public class Chef {
	public void deliverSnackAtTheCounter() {
		System.out.println("Entregando lanche no balcão...");
	}
	
	public void deliverJuiceAtTheCounter() {
		System.out.println("Entregando suco no balcão...");
	}
	
	public void deliverComboAtTheCounter() {
		deliverSnackAtTheCounter();
		deliverJuiceAtTheCounter();
	}
	
	void prepareSnack() {
		System.out.println("Preparando lanche...");
	}
	
	void prepareJuice() {
		System.out.println("Preparando suco...");
	}
	
	void prepareCombo() {
		prepareSnack();
		prepareJuice();
	}
	
	void askToSwitchGas(Attendant myFriend) {
		myFriend.switchGas();
	}
	
	void askToSwitchGas(Warehouseman myFriend) {
		myFriend.switchGas();
	}
	
	void askForIngredients(Warehouseman myFriend) {
		myFriend.deliverIngredients();
	}
}
