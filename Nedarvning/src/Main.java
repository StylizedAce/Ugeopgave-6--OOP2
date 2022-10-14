import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> passedCourse = new ArrayList<>();
        passedCourse.add("Java 1.0");
        passedCourse.add("PlantUML");

        ArrayList<Person> students = new ArrayList<>();
        students.add(new Student("Joe", passedCourse));
        students.add(new Student("Peter", passedCourse));
        students.add(new Student("Magnus", new ArrayList<>()));

        ArrayList<String> canTeach = new ArrayList<>();
        canTeach.add("Java 1.0");
        canTeach.add("Programming");
        canTeach.add("PlantUML");

        ArrayList<Teacher> teachers = new ArrayList<>();

        teachers.add(new Teacher("Tobias", canTeach));
        teachers.add(new Teacher("Tess", canTeach));
        teachers.add(new Teacher("Jimmy", new ArrayList<>()));

        for (Teacher t : teachers) {
            if(t.addCourse("Java 1.0") == false) {
                System.out.println(t.getName()+" cannot teach this course. They must first master Java 1.0.");
            }

        }

        for (Person p : students) {
            if (p.addCourse("Java 1.0") == false) {
                System.out.println(p.getName()+" has already passed this course.");
            }
        }
    }
}