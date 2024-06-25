package cafeteria;

import cafeteria.kitchen.Attendant;
import cafeteria.kitchen.Chef;
import cafeteria.kitchen.Warehouseman;
import cafeteria.open.Client;

public class Establishment {
	public static void main(String[] args) {
		Chef chef = new Chef();
		Attendant attendant = new Attendant();
		Client client = new Client();

		// Chef
		chef.deliverSnackAtTheCounter();
		chef.deliverJuiceAtTheCounter();
		chef.deliverComboAtTheCounter();
						
		// Attendant
		attendant.getSnackAtTheKitchen();
		attendant.serveTable();
		attendant.receivePayment();
				
		// Client
		client.chooseSnack();
		client.makeOrder();
		client.payBill();
	}
}
