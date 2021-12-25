import java.util.Scanner;
public class Lab03PartA
{
    public static void main(String args[])
    {
		//Implemnt Lab03PartA
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");

        int row_no= Integer.parseInt(myObj.nextLine());
//        System.out.println(row_no);
        int max = row_no * (row_no + 1) / 2;

        for (int i=0;i<row_no;i++){
            int num=max,num1=row_no-1;
            for (int j=0;j<=i;j++) {
                if (j == 0) {
                    System.out.print(max + "  ");
//                    num = num - 1;
                }
                else{
                    num=num-num1;
                    System.out.print( num + "  ");
                    num1=num1-1;
                }
            }
            max=max-1;
            System.out.println();
        }
	}
	
}
	