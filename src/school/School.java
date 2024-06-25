package school;

public class School {
	public static void main(String[] args) {
		Student guilherme = new Student();
		guilherme.setName("Guilherme");
		guilherme.setAge(31);
		
		System.out.println("O aluno " + guilherme.getName() + " tem " + guilherme.getAge() + " anos de idade.");
	}
}
