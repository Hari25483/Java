import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Copy extends GenericCommand{
    public void handleCommand(String [] args) {
        if (!args[0].equals("copy")){
            someThingWrong();
        }

        if (args.length!=3){
            System.out.println("Usage: copy  sourcefilename.txt  destinationfilename.txt");
            return;
        }
        if (args[0].equals("copy")) {
            try {
                //Read the file content
                File file1 = new File(args[1]);
                Scanner read1 = new Scanner(file1);
                String Str = "";
                //Store  the file content in a string inorder to write it to another file
                while (read1.hasNextLine()) {
                    Str=Str+read1.nextLine()+"\n";
                }
                read1.close();
                //Write to another file
                FileWriter fw = new FileWriter(args[2]);
                fw.write(Str);
                fw.close();
                System.out.println("Successfully copied");
                Shell.count+=1;
            }
            //Print error message if file is not found or file is not readable
            catch (Exception e) {
                System.out.println("Error Occured");
                e.printStackTrace();
            }

        }
    }
}
