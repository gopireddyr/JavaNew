package GopiTech;

public class Employee {

	String Employee_name;
	private int Employee_id;
	private int Employee_salary;
	int Employee_age;
	public Employee(String employee_name, int employee_id, int employee_salary, int employee_age) {
		super();
		Employee_name = employee_name;
		Employee_id = employee_id;
		Employee_salary = employee_salary;
		Employee_age = employee_age;
	}
	public String getEmployee_name() {
		return Employee_name;
	}
	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}
	public int getEmployee_id() {
		return Employee_id;
	}
	public void setEmployee_id(int employee_id) {
		Employee_id = employee_id;
	}
	public int getEmployee_salary() {
		return Employee_salary;
	}
	public void setEmployee_salary(int employee_salary) {
		Employee_salary = employee_salary;
	}
	public int getEmployee_age() {
		return Employee_age;
	}
	public void setEmployee_age(int employee_age) {
		Employee_age = employee_age;
	}
	
	
}
