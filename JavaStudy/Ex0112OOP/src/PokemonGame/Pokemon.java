package PokemonGame;

public class Pokemon {
	//이름, 체력, 공격력, 기술, 타입(속성)
	private String name;
	private String skill;
	private int hp;
	private int atk;
	private String type;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Pokemon(String name, String skill, int hp, int atk, String type) {
		
		this.name = name;
		this.skill = skill;
		this.hp = hp;
		this.atk = atk;
		this.type = type;
	}
	
	
	
	
}

