package enums;

public enum Liquidity {

	LOW(1,"Low"),MEDIUM(2,"Medium"),HIGH(3,"High");
	
	private Integer id;
	private String name;
	
	private Liquidity(Integer id,String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public Integer getId() {
		return id;
	}
}
