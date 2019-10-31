package model;

public class Usuario {
	private String lastNameP;
	private String lastNameM;
	private String name;
	private int age;
	private String curp;
	private String school;
	private String categoria;
	private String team;
	private long id;
	
	public Usuario(String lastNameP, String lastNameM, String name, int age, String curp, String school,
			String categoria, String team) {
		super();
		this.lastNameP = lastNameP;
		this.lastNameM = lastNameM;
		this.name = name;
		this.age = age;
		this.curp = curp;
		this.school = school;
		this.categoria = categoria;
		this.team = team;
	}
	
	public Usuario() {
		
	}

	public String getLastNameP() {
		return lastNameP;
	}

	public void setLastNameP(String lastNameP) {
		this.lastNameP = lastNameP;
	}

	public String getLastNameM() {
		return lastNameM;
	}

	public void setLastNameM(String lastNameM) {
		this.lastNameM = lastNameM;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}