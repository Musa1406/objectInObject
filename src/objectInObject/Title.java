package objectInObject;

public class Title {
	private String name;
	private int rank;
	public Title() {
		super();
	}
	public Title(String name, int rank) {
		super();
		this.name = name;
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

}
