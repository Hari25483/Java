import java.util.LinkedList;
import java.io.FileNotFoundException;
import java.util.Queue;
import java.util.Scanner;
import java.io.File;


public class Lab03PartE {
  
    public static void main(String[] args) {

        Queue<Student> student = new LinkedList<>(); // make ArrayList

        //Try reading data from file
        try{
            //open excel file and read read_data
            File excel_file = new File("StudentList");
            Scanner read = new Scanner(excel_file);
            while(read.hasNextLine()){
                // read data and spilt them using tabs
                String[] read_data = read.nextLine().split("\t");
                // create a student object
                Student s = new Student(read_data[0], read_data[1]);
                //Append data to ArrayList
                student.add(s);
            }
            read.close();
        }
        catch(FileNotFoundException e){
            //check file read properly
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
        //remove titles
        student.poll();

        //read user input
        boolean check = false;
        //read user input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your input: ");
        String input_text;
        input_text = in.nextLine();
        in.close();
        int len=input_text.length();

       //check for one letter
        if(len == 1){
            for(Student s : student){
                if ( (s.getName().charAt(0) == input_text.charAt(0)-32)||(s.getName().charAt(0) == input_text.charAt(0))){
                    check = true;
                    System.out.println(s.msg());
                }
            }
        //check for string 
        }else{
            for(Student s : student){
                if(input_text.equals(s.getEnum())){
                    check = true;
                    System.out.println(s.msg());
                }
            }
        }
        //input validation
        if(check==false){
            System.out.println("Invalid Input: " + input_text);
        }
    }
}

class Student{
    private String name,Enum;

    public Student(String Enum, String name){
        this.Enum = Enum;
        this.name = name;
    }

    public String msg(){
        return Enum +  " " +name;
    }

    public String getEnum(){
        return Enum;
    }

    public String getName(){
        return name;
    }
}
