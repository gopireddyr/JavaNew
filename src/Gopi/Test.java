package Gopi;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Lottery lot=new Lottery();
		lot.BuyTicket(1,24,1,2,3,4,5,6);
		lot.BuyTicket(2,21,1,2,3,8,6,7);
		lot.BuyTicket(3,23,1,2,9,8,6,7);
		lot.BuyTicket(4,22,9,8,7,6,5,4);
		lot.BuyTicket(5,25,4,5,6,1,2,7);
		lot.BuyTicket(6,26,8,7,2,1,3,9);
		lot.BuyTicket(7,26,4,5,6,7,8,9);
		lot.listofusers();
		lot.PickLottery();
		
	}

}
