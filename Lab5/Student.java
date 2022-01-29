//Author: Hariharan Raveenthiran
//E/18/128
//Lab05

public class Student {
    private String surname;
    private int attendance;
    private int attendance_percent;
    //Declaring these variables static so that we can get total counts of students and their attendance in the Main java file.
    static int total_Attendance;
    static int student_count;

    public Student(String name, int attendance){
        this.surname=name;
        this.attendance=attendance;
        //Calculate total attendance, and no of students
        total_Attendance = attendance + total_Attendance;
        student_count = student_count +1;
    }
    //method to get surname
    public String getSurName(){
        return this.surname;
    }
    //method to set surname
    public void setSurName(String surname){
        this.surname=surname;
    }
    
    //String method which returns details of student
    public String toString() {
        return "Student: " + surname + "	Attendance: "+ attendance;
    }

    //method to get attendance percentage of a student
    
    public int getattendancePercentage(){
        attendance_percent=(this.attendance*100)/45;
        return (attendance_percent);
    }

    //Static method to get total average attendance of all students
    public static float getAverageAttendance() {
        return total_Attendance / ((float) student_count * 45) * 100;
    }
}
