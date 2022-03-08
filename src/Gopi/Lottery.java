package Gopi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Lottery {
	
	static ArrayList<Customer> list=new ArrayList<Customer>();
	static ArrayList<Customer> arr=new ArrayList<Customer>();
	static ArrayList<Customer> temp=new ArrayList<Customer>();
	static ArrayList<Integer> num=new ArrayList<Integer>();
	
	public void BuyTicket(int customer_id,int age,int num1,int num2,int num3,int num4,int num5,int num6){
		
		Customer cust=new Customer(customer_id, age, num1, num2, num3, num4, num5, num6);
		list.add(cust);
		
	}
	//To print customer details and lottery details.
	public void listofusers() 
	{
		
		for(int i=0;i<list.size();i++)
		{
		Customer custom=new Customer(list.get(i).getCustomer_id(),list.get(i).getAge(),0);
		arr.add(custom);
		System.out.println("customer Id :"+list.get(i).getCustomer_id()+" age :"+list.get(i).getAge()+"  Num1 : "+list.get(i).getNum1()+"  Num2 : "+list.get(i).getNum2()+"  Num3 : "+list.get(i).getNum3()+"  Num4 : "+list.get(i).getNum4()+"  Num5 : "+list.get(i).getNum5()+"  Num6 : "+list.get(i).getNum6());
		}
		
	}
	public void PickLottery()
	{
		System.out.println();
		System.out.print("Lottery Number : ");
		int count=0;
		//Picking 6 random numbers from 1 to 9
		Random r = new Random();
		for(int i=0;i<6;i++) 
		{
			num.add(r.nextInt(9-1) + 1);
			System.out.print(num.get(i)+"  ");
			
		}
		System.out.println();
		
		  System.out.println();
		//Checking lottery match
		for(int i=0;i<num.size();i++)
		{
			 for(int j=0;j<list.size();j++)
				{
					if(num.get(i)==list.get(j).getNum1())
					{
						count=arr.get(j).getNum1()+1;	
						Customer custom=new Customer(list.get(j).getCustomer_id(),list.get(j).getAge(),count);
						arr.remove(j);
						arr.add(j,custom);
						list.get(j).setNum1(0);
					}
					else if(num.get(i)==list.get(j).getNum2())
					{
						count=arr.get(j).getNum1()+1;	
						Customer custom=new Customer(list.get(j).getCustomer_id(),list.get(j).getAge(),count);
						arr.remove(j);
						arr.add(j,custom);
						list.get(j).setNum2(0);
					}
					else if(num.get(i)==list.get(j).getNum3())
					{
						count=arr.get(j).getNum1()+1;	
						Customer custom=new Customer(list.get(j).getCustomer_id(),list.get(j).getAge(),count);
						arr.remove(j);
						arr.add(j,custom);
						list.get(j).setNum3(0);
					}
					else if(num.get(i)==list.get(j).getNum4())
					{
						count=arr.get(j).getNum1()+1;	
						Customer custom=new Customer(list.get(j).getCustomer_id(),list.get(j).getAge(),count);
						arr.remove(j);
						arr.add(j,custom);
						list.get(j).setNum4(0);
					}
					else if(num.get(i)==list.get(j).getNum5())
					{
						count=arr.get(j).getNum1()+1;	
						Customer custom=new Customer(list.get(j).getCustomer_id(),list.get(j).getAge(),count);
						arr.remove(j);
						arr.add(j,custom);
						list.get(j).setNum5(0);
					}
					else if(num.get(i)==list.get(j).getNum6())
					{
						count=arr.get(j).getNum1()+1;	
						Customer custom=new Customer(list.get(j).getCustomer_id(),list.get(j).getAge(),count);
						arr.remove(j);
						arr.add(j,custom);
						list.get(j).setNum6(0);
					}
				}
		}
		for(int i=0;i<arr.size();i++)
		{
			
			System.out.println("customer Id :"+arr.get(i).getCustomer_id()+" age :"+arr.get(i).getAge()+"  Count : "+arr.get(i).getNum1());
			
			
			if(arr.get(i).getNum1()<4)
			{
				arr.remove(i);
				i--;
			}
		}
		System.out.println();
		System.out.println(arr.size()+ " Members selected :");
		System.out.println();
		//Sorting array with age.
		for(int i=0;i<arr.size();i++)
		{
			for(int j=i+1;j<arr.size();j++)
			{
				if(arr.get(i).getAge()>arr.get(j).getAge())
				{
					temp.add(arr.get(i));
					arr.remove(i);
					arr.add(i, arr.get(j-1));
					arr.remove(j);
					arr.add(j, temp.get(0));
					temp.remove(0);
					
				}
				
			}
			if(arr.get(i).getNum1()==4)
			{
				System.out.println("Customer with Id : "+arr.get(i).getCustomer_id()+" won price of 10000, matched 4");
			}
			if(arr.get(i).getNum1()==5)
			{
				System.out.println("Customer with Id : "+arr.get(i).getCustomer_id()+" won price of 1000000, matched 5");
			}
			if(arr.get(i).getNum1()==6)
			{
				System.out.println("Customer with Id : "+arr.get(i).getCustomer_id()+" won 100000000,  matched 6");
			}
			
		}
		
		
	}
}
