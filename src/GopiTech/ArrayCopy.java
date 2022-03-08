package GopiTech;

import java.util.*;

public class ArrayCopy {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		//Taking input from user for array length
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		// creating array and taking values from user
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//coping elements from one array to other (arr to brr). 
		//we can write arr=brr but it does not copy elements of arr, it only user reference of arr
		int brr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			brr[i]=arr[i];
			System.out.println(brr[i]);
		}
		
		// creating list
		 List<String> list1 = new ArrayList<String>();
         list1.add("Apple");
         list1.add("ball");
         List<String> list2 = new ArrayList<String>();
         list2.addAll(list1);
         System.out.println(list2);
         Employee e1=new Employee("Krishna", 123, 16000, 20);
         Employee e2=new Employee("SaiKrishna", 321, 19000, 23);
         //Creating vector for Employee class
         Vector<Employee> EmpVec = new Vector<Employee>(n);
         EmpVec.add(e1);
         System.out.println("Name : "+EmpVec.get(0).getEmployee_name()+" Employee id : "+EmpVec.get(0).getEmployee_id()+" Salary : "+EmpVec.get(0).getEmployee_salary()+" Age : "+EmpVec.get(0).getEmployee_age());
         //Creating Linked list for Employee class
         LinkedList<Employee> EmpLink=new LinkedList<Employee>();  
         EmpLink.add(e2);
         System.out.println("Name : "+EmpLink.get(0).getEmployee_name()+" Employee id : "+EmpLink.get(0).getEmployee_id()+" Salary : "+EmpLink.get(0).getEmployee_salary()+" Age : "+EmpLink.get(0).getEmployee_age());
         
	}

}
