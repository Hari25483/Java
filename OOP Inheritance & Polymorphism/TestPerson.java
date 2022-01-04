public class TestPerson {
    public static void main(String[] args){
        Student s1=new Student("Hari","Sri Lanka");
        s1.addCourseGrade("GP106",90);
        s1.addCourseGrade("GP118",95);
        s1.printGrades();
        System.out.println(s1.getAverageGrade());

        Teacher t1=new Teacher("John","California");
        System.out.println(t1);
        String[] courses={"GP106","GP108","GP116"};
        for (String course:courses){
            if (t1.addCourse(course)){
                System.out.println("Course Added");
            }
            else{
                System.out.println("Cant be added");
            }
        }
        for (String course: courses) {
            if (t1.removeCourse(course)) {
                System.out.println(course + " removed");
            } else {
                System.out.println(course + " cannot be removed");
            }
        }
    }
}