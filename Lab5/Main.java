//Author: Hariharan Raveenthiran
//E/18/128
//Lab05

import java.math.*;
import java.util.Random; // for random
import java.io.*; // for file IO

class Main{
    /* contains some sample code which might be useful for the lab */

    public static void main(String [] args) { 

	/* Method 1: the Math class provides a static method called random 
	 * to generate a random number between 0 and 1. 
	 * You can multiply with a suitable MAX to get an 
	 * integer within a range 
	 */

	//Generate random integer between 0 to 45
	int MAX = 45;
	int rand = (int)(Math.random() * 45); // cast to int

	/* Method 2: create Random object. When creating an object you can 
	 * give a seed (of type long) or not. 
	 * see https://docs.oracle.com/javase/7/docs/api/java/util/Random.html 
	 * The object provides a method called nextInt(int n) which returns 
	 * a integer between 0 and n (inclusive). 
//	 */


	/**************************************************************/ 
	/* Reading a file. 
	 */
	BufferedReader descriptor = null; 
	String line ="";
    int count=61;
    String [] names = new String[count]; // 61 names
    try{
        descriptor = new BufferedReader(new FileReader("co225-classlist.txt"));
        for(int i=0; i < count; i++) { // assume file has 61 lines
            names[i] = descriptor.readLine();
        }
        descriptor.close();}

    catch(IOException e) {
	    // IOException is more generic (FileNotFound is a type of a 
	    // IOException, so catching only that is sufficient 
	    System.out.println("Bad things happen, what do you do!" + e);
	    return; 
	}

	// we will run only if no exceptions were thrown

	//Create a Student object array with given number of participants
	Student [] Students=new Student[count];
	for(int i=0; i < names.length; i++) {

		//Append data to ArrayList
		Random randomGen = new Random();
		Student s = new Student(names[i],randomGen.nextInt(MAX));
		Students[i]=s;
	}

		//Create a file with data of students with with attendance less than 80%.
		FileWriter ineligible_file = null;
		try {
			ineligible_file = new FileWriter("co225-classlist-ineligible.txt");
			for(int i=0; i < names.length; i++) {
				if (i==count){
					continue;
				}
				if (Students[i].getattendancePercentage() < 80) {
					ineligible_file.write(Students[i].getSurName()+"\n");
				}
			}
			//Close the filewriter
			ineligible_file.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		//Update the existing file with the text "-ineligible" added to students with attendance less than 80%.
		FileWriter new_Classlist_file = null;
		try {
			new_Classlist_file = new FileWriter("co225-classlist.txt");
			for(int i=0; i < names.length; i++) {
				if (i==count){
					continue;
				}
				//Stduents with attendance less than 80%
				else if (Students[i].getattendancePercentage() < 80) {
					//Print their names
					System.out.println(Students[i].getSurName());
					//Write their name to the file with ineligible text added.
					Students[i].setSurName(Students[i].getSurName()+"-ineligible"+"\n");
					new_Classlist_file.write(Students[i].getSurName());
				}
				else{
					new_Classlist_file.write(Students[i].getSurName()+"\n");
				}
			}
			//Close the file writer
			new_Classlist_file.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}


		//Get average attendance of the class
		System.out.println("\nAverage attendance percentage of students in class is: "+ Student.getAverageAttendance()+"%");


	}
}
