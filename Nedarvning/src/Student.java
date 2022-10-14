import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            return false;
        } else {
            currentCourses.add(course);
            System.out.printf(this.name+" has yet to pass the course: %s", course);
            return true;
        }
    }
}
