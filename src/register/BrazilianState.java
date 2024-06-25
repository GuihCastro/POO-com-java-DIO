package register;

public enum BrazilianState {
	SAO_PAULO ("São Paulo", "SP", 11),
	RIO_DE_JANEIRO ("Rio de Janeiro", "RJ", 12),
	PIAUI ("Piauí", "PI", 13),
	MARANHAO ("Maranhão", "MA", 14),
	CEARA ("Ceará", "CE", 15)
	;
	
	private String name;
	private String acronym;
	private int ibge;
	
	private BrazilianState(String name, String acronym, int ibge) {
		this.name = name;
		this.acronym = acronym;
		this.ibge = ibge;
	}

	public String getName() {
		return name;
	}

	public String getAcronym() {
		return acronym;
	}
	
	public String getUppercaseName() {
		return name.toUpperCase();
	}
	
	public int getIbge() {
		return ibge;
	}
}
