package GopiTech;

class One {

	public void method1() {

		System.out.println("Class : One, method1");
		

	}
	public void method2() {

		System.out.println("Class : One, method2");

}
}

//inheritance

class Two extends One {

	public void method1() {

		System.out.println("Class : Two,method1");

	}

	public int add(int x, int y) {

		return x+y;

	}

	//Overload

	public double add(double x,double y) {

		return x+y;

	}

}

//encapsulation example

class EncapTest {

	private String name;

	public String getName() {

		return name;

	}

	public void setName(String newName) {

		name = newName;

	}

}

//abstraction

abstract class TwoWheeler {

	public abstract void run();

}

class Honda extends TwoWheeler{

	public void run(){

		System.out.println("\nbike is Running..");

	}

}

class MainClass {

	public static void main(String[] args) {

		One a=new One();

		a.method1();

		Two b=new Two();

		b.method1();
		//even though there is no method2 in class two , it is taking from class class one method2 . it is example of inheritance
		b.method2();
		 //there are two methods with same name but the return type and arguments are different. this is example of  polymorphism method Overload
		System.out.println(b.add(4,2));

		System.out.println(b.add(5.,2.));
		//access specifier is private and able to access it from other class. this is example of encasulation
		EncapTest encap = new EncapTest();

		encap.setName("Sandeep's");

		System.out.print("Name : " + encap.getName() );
		//there is no implementation for run method in TwoWheeler class, executing Honda class run method. this is example of abstraction
		TwoWheeler test = new Honda();

		test.run();

	}

}