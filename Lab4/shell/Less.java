import java.util.*;
import java.io.*;

public class Less extends GenericCommand{
    public void handleCommand(String [] args) {
        if (!args[0].equals("less")){
            someThingWrong();
        }

        if (args.length!=2){
            System.out.println("Usage: less  filename.txt");
            return;
        }
        try{
            //Read the file content
            File new_file = new File(args[1]);
            Scanner read = new Scanner(new_file);
            while(read.hasNextLine()){
                //print contents of file in the console
                System.out.println(read.nextLine());
            }
            read.close();
            Shell.count+=1;
        }
        //Print error message if file is not found or file is not readable
        catch(FileNotFoundException e){
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
    }
}
