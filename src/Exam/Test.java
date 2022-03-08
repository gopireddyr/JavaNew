package Exam;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Address address1=new Address(12, "Customer 1 street", "Customer 1 city", "State1", "C1C1C1");
		Address address2=new Address(12, "Customer 2 street", "Customer 2 city", "State1", "C2C2C2");
		Address address3=new Address(12, "Customer 3 street", "Customer 3 city", "State1", "C3C3C3");
		Address address4=new Address(12, "Customer 4 street", "Customer 4 city", "State1", "C4C4C41");
		Address address5=new Address(12, "Customer 5 street", "Customer 5 city", "State1", "C5C5C5");
		Customer c1=new Customer("Customer1",22,1,address1);
		Customer c2=new Customer("Customer2",11,2,address2);
		Customer c3=new Customer("Customer3",18,3,address3);
		Customer c4=new Customer("Customer4",55,3,address4);
		Customer c5=new Customer("Customer5",16,3,address5);
		ArrayList<Customer> cos=new ArrayList<Customer>();
		ArrayList<Customer> temp=new ArrayList<Customer>();
		cos.add(c1);
		cos.add(c2);
		cos.add(c3);
		cos.add(c4);
		cos.add(c5);
		
		for(int i=0;i<cos.size();i++)
		{
			for(int j=i+1;j<cos.size();j++)
			{
				if(cos.get(i).getCustomer_age()>cos.get(j).getCustomer_age())
				{
					temp.add(cos.get(i));
					cos.remove(i);
					cos.add(i, cos.get(j-1));
					cos.remove(j);
					cos.add(j, temp.get(0));
					temp.remove(0);
					
				}
				
			}
			
			System.out.println("Name :"+cos.get(i).getCustomer_name()+"Customer Age" +cos.get(i).getCustomer_age() +", Customer Id "+cos.get(i).getCustomer_id()+" , Adress is "+cos.get(i).getCustomer_Address().getStreet_number() +" "+cos.get(i).getCustomer_Address().getStreet_name() +" "+cos.get(i).getCustomer_Address().getCity()+" "+cos.get(i).getCustomer_Address().getState()+" " +cos.get(i).getCustomer_Address().getPostal_code() );
			
	}
		
		

}
}
