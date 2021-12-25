import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.*;
public class Lab03PartB
{
	public static void main(String args[])
    {
		//Implemnt Lab03PartB
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the digit");

		int index= Integer.parseInt(myObj.nextLine());
		findAdjacentsByArray(index);
		findAdjacentsByMap(index);

	}
	
	public static void findAdjacentsByArray(int index){
		//Implemnt Lab03PartB a
		char[] alphabets ={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

		if ((index < 26) && (index > 1)) {
			System.out.println("<" + (index - 1) + "," + alphabets[index - 2] + ">," + "<" + (index + 1) + "," + alphabets[index] + ">");
		}
		else if ((index == 0) || (index == 1)) {
			System.out.println("<Null,Null>," + "<" + (index + 1) + "," + alphabets[index] + ">");
		}
		else if (index == 27 || index == 26) {
			System.out.println("<" + (index - 1) + "," + alphabets[index - 2] + ">," + "<Null,Null>");
		}
	}
	
	public static void findAdjacentsByMap(int index)
	{
		//Implemnt Lab03PartB b
		char[] alphabets ={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

		HashMap< Integer, Character > alpha = new HashMap < Integer, Character > ();
		for (int i=0;i<26;i++){
			alpha.put(i+1, alphabets[i]);
		}
		if ((index < 26) && (index > 1)) {
			System.out.println ("<" + (index - 1) + "," + alpha.get (index - 1) + ">," +"<" + (index + 1) + "," + alpha.get (index + 1) + ">");
		}
		else if ((index == 0) || (index == 1)) {
			System.out.println ("<Null,Null>," + "<" + (index + 1) + "," +alpha.get (index + 1) + ">");
		}
		else if (index == 27 || index == 26) {
			System.out.println ("<" + (index - 1) + "," + alpha.get (index - 1) + ">," + "<Null,Null>");
		}
	}
	
}
	