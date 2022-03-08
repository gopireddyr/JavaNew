package GopiTech;

//Abstract class with one method define and implementation in Bird class. 
abstract class Animal{
	
	abstract void Define();
}
class Bird extends Animal {

	void Define() {
		System.out.println("This is Called form Abstract class");
	}	 
	
}
// Animals class is for encapsulation
class Animals{
	private String name;

	// Getter methods
	public String getName() {
		return name;
	}
	// Setter methods
	public void setName(String name) {
		this.name = name;
	}

}

class TestBird {
	public static void main(String[] args) {
		//Animal is abstract class and calling define method in Bird
		Animal myBird = new Bird();
		myBird.Define();
		//example for encapsulation.
		Animals myAnimal = new Animals();
		myAnimal.setName("Encapsulation Example");
		System.out.println("Name: " + myAnimal.getName());
	}
}