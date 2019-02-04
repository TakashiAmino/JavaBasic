package practice18;

public class Player{
	private String position;
	private String name;
	private String country;
	private String team;
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	Player(String a,String b,String c,String d){
		this.position = a;
		this.name = b;
		this.country = c;
		this.team = d;
	}

	public Player() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public String toString() {

		return (this.position+","+this.country+","+this.name+","+this.team);
	}


}