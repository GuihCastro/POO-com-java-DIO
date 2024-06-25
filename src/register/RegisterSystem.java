package register;

public class RegisterSystem {
	public static void main(String[] args) {
		Person tiao = new Person("Tião", "12345678910");
		Person tina = new Person();
		
		tiao.setAddress("Rua do Tião");
		
		System.out.println(tiao.getName() + ", de cpf " + tiao.getCpf() + ", mora na " + tiao.getAddress());
	}
}
