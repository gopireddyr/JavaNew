package logics;


public class Parameters {
	
	public static void main(String[] args) {
		C c=new C();
		c.x=12;
		System.out.println(c.x);
		Meth1(c.x);
		System.out.println(c.x);
		Meth2(c);
		System.out.println(c.x);
		Meth3(c);
		System.out.println(c.x);
	}
	
	public static void Meth1(int p) {
		p=p+1;
		}
	public static void Meth2(C p) {
		p.x=p.x+6;
		}
	public static void Meth3(C p) {
		p=new C(); 
		p.x=4;
		}
	
	

}
