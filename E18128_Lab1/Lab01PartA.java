public class Lab01PartA {

    public static void main(String args[]) {
      int marks = 63; // example
      showGrade(marks);
    }

    public static void showGrade(int marks){
        //Implement A
        String grade="";
        switch (marks/10) {
            case 10:
            case 9:
            case 8:
                grade="A";
                break;
            case 7:
                grade="B";
                break;
            case 6:
                switch(marks%10){
                    case 9: case 8: case 7: case 6: case 5:
                        grade="B";
                        break;
                    case 4: case 3: case 2: case 1: case 0:
                        grade="C";
                        break;
                }
                break;
            case 5:
                switch(marks%10){
                    case 9:
                    case 8:
                    case 7:
                    case 6:
                    case 5:
                        grade="C";
                        break;
                    case 4:
                    case 3:
                    case 2:
                    case 1:
                    case 0:
                        grade="D";
                        break;
                }
                break;
            case 4:
                grade="F";
                break;
            case 3:
                grade="F";
                break;
            case 2:
                grade="F";
                break;
            case 1:
                grade="F";
                break;
        }
        System.out.println(grade);
    }
}