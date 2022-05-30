
public class Reddy implements Gopi {

	
	public int sub(int a,int b) {
		
		return a+b;
	}
	public static void main(String[] args) {
		Reddy reddy=new Reddy();
		System.out.println("Calling sum default:"+reddy.sub(10,30));
		System.out.println("Calling multiple form main method :"+Gopi.mult(10,16));
	}

}
