package register;

public class IbgeSystem {
	public static void main(String[] args) {
		for (BrazilianState state: BrazilianState.values()) {
			System.out.println(state.getName() + " - " + state.getAcronym());
		}
		
		BrazilianState saoPaulo = BrazilianState.SAO_PAULO;
		
		System.out.println(saoPaulo.getName());
		System.out.println(saoPaulo.getAcronym());
		System.out.println(saoPaulo.getUppercaseName());
		System.out.println(saoPaulo.getIbge());
	}
}
