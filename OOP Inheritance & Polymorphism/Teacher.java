public class Teacher extends Person{
    private int numCourses;   // number of courses taught currently
    private String[] courses; // course codes
    private static final int MAX_COURSES = 5; // maximum courses

    /** Constructs a Teacher instance with the given name and address */
    public Teacher(String name, String address) {
        super(name,address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
    }

    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
    public  boolean addCourse(String course){
        for (int i=0;i<numCourses;i++){
            if (courses[i].equals(course)){
                return false;
            }
        }
        courses[numCourses]=course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course){
        boolean found=false;
        int courseIndex=0;
        for (int i=0;i<numCourses;i++){
            if (courses[i].equals(course)){
                courseIndex=i;
                found=true;
                break;
            }
        }
        if (found){
            for (int i=courseIndex;i<numCourses-1;i++){
                courses[i]=courses[i+1];
            }
            numCourses--;
            return true;
        }
        else{
            return false;
        }
    }
}