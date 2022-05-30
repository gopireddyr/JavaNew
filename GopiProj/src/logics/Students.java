package logics;

public class Students {
	
	String name;
	int student_id;
	char student_level;
	int residancy_status;
	int credit_hours;
	
	public Students() {
		super();
	}

	public Students(String name, int student_id, char student_level, int residancy_status, int credit_hours) {
		super();
		this.name = name;
		this.student_id = student_id;
		this.student_level = student_level;
		this.residancy_status = residancy_status;
		this.credit_hours = credit_hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public char getStudent_level() {
		return student_level;
	}

	public void setStudent_level(char student_level) {
		this.student_level = student_level;
	}

	public int getResidancy_status() {
		return residancy_status;
	}

	public void setResidancy_status(int residancy_status) {
		this.residancy_status = residancy_status;
	}

	public int getCredit_hours() {
		return credit_hours;
	}

	public void setCredit_hours(int credit_hours) {
		this.credit_hours = credit_hours;
	}
	
	
	
}
