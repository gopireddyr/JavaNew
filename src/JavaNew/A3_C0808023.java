package JavaNew;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Abdul Razak
 *
 */
public class A3_C0808023 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String list;
		
		do {
			list=JOptionPane.showInputDialog("Menu\n 1.Press 1 to print your name\n 2.Press 2 to open a File and write values in your file\n 3.Press 0 to exit the program");//input
			switch (list) {
			
			case "1":
				printName();
				break;
			case "2":
				inputDialogue();
				break;
			case "0":
				outputDialogue("Program exit");
				break;
			default:
				outputDialogue("Invalid Input");	
				}
		}while(!list.equalsIgnoreCase("0"));
		
	}
	
	/**
	 * This function takes input from user and validate the file name
	 * @throws IOException
	 */
	public static void inputDialogue() throws IOException {
		
		String fileName="C0808023.txt";
		String name;
		//For validation of file name
		do {
			
			name=JOptionPane.showInputDialog("Enter File Name (file name is C0808023.txt)");//input
			if(name==null) {
				outputDialogue("User did not enter any file name");
				break;
			}
			else if (name.equalsIgnoreCase(fileName)){
				outputDialogue("File name is correct");
				fileWrite(name);
				String check=JOptionPane.showInputDialog("Do you want to see numbers, their total and average?\n1.Press 1 for YES\n2.Press 0 for NO");//input
				if(check.equalsIgnoreCase("1"))
				{
					average(name);
				}
				else if (check.equalsIgnoreCase("0"))
				{
					outputDialogue("Nothing to display");
				}
				
			}
			
		}while(!fileName.equalsIgnoreCase(name));
		
		
	}
	
	/**
	 * @param message
	 * This function is for output
	 */
	
	public static void outputDialogue(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * @param fileName
	 * @throws IOException
	 * This function take input from user and write data in file
	 */
	public static void fileWrite(String fileName) throws IOException {
		
		FileWriter fw = new FileWriter(fileName, true);
		PrintWriter file = new PrintWriter(fw);
		String number;
		String check;
		do {
			number=JOptionPane.showInputDialog("Enter number you want to write in the file");//input
			check=JOptionPane.showInputDialog("If you want to enter another number?\n1.Press 1 for YES\n2.Press 0 for NO");//input
			file.println(number);
			
		}while(!check.equalsIgnoreCase("0"));
		
		file.close();
	}
	
	/**
	 * 
	 * @param fileName
	 * @throws IOException
	 * 
	 * This function calculates the average 
	 */
	public static void average(String fileName) throws IOException {
		int count=0, total=0, avg=0;
		File file = new File(fileName);
		String numbers="File contain following numbers: ";
		Scanner inputFile = new Scanner(file); 
		
		while (inputFile.hasNext()) {
			String data = inputFile.nextLine();
			numbers=numbers.concat(data);
			numbers=numbers.concat(" ");
			total += Integer.parseInt(data);
			count++;
		}
		avg=total/count;
		outputDialogue(numbers);
		outputDialogue("Total of the numbers:" + " " + total);
		outputDialogue("Average of the numbers:" + " " + avg);
		inputFile.close();
	}
	
	/**
	 * Print name function
	 */
	public static void printName() {
		outputDialogue("Abdul Razak");
	}

}

