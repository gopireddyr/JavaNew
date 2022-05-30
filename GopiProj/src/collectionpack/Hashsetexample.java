package collectionpack;

import java.util.Objects;

public class Hashsetexample {
	
	String First_Name;
	String Last_Name;
	int age;
	public Hashsetexample(String first_Name, String last_Name, int age) {
		super();
		First_Name = first_Name;
		Last_Name = last_Name;
		this.age = age;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(First_Name, Last_Name, age);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hashsetexample other = (Hashsetexample) obj;
		return Objects.equals(First_Name, other.First_Name) && Objects.equals(Last_Name, other.Last_Name)
				&& age == other.age;
	}
	@Override
	public String toString() {
		return "Hashsetexample [First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", age=" + age + "]";
	}
	
	

}
