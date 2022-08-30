import java.util.ArrayList;

class Student {
    String name;
    int rollNo;
    int[] marks;

    Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

class Course {
    String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.name + " added");
    }

    public void average() {
        int totalMark1 = 0, totalMark2 = 0, totalMark3 = 0;
        for (Student student : students) {
            totalMark1 += student.marks[0];
            totalMark2 += student.marks[1];
            totalMark3 += student.marks[2];
        }
        int sizeOfArray = students.size();
        String msg = "Average score in subject ";
        System.out.println(msg + 1 + " - " + totalMark1 / sizeOfArray);
        System.out.println(msg + 2 + " - " + totalMark2 / sizeOfArray);
        System.out.println(msg + 3 + " - " + totalMark3 / sizeOfArray);
    }

    public void roll() {
        for (Student student : students) {
            System.out.println();
            System.out.println("Name - " + student.name);
            System.out.println("Roll no - " + student.rollNo);
            System.out.println("Scores:");
            System.out.println("\tSubject 1 - " + student.marks[0]);
            System.out.println("\tSubject 2 - " + student.marks[1]);
            System.out.println("\tSubject 3 - " + student.marks[2]);
            System.out.println();
        }
    }
}

public class CourseHandler {
    public static void main(String[] args) {
        Course course = new Course("Geography");
        course.addStudent(new Student("Kaiden Hopkins", 5667, new int[]{50, 60, 55}));
        course.addStudent(new Student("Sophie Barrett", 5668, new int[]{66, 72, 80}));
        //course.addStudent(new Student("Zoey Schultz", 5670, 37, 80 ,52));
        //course.addStudent(new Student("Maggie Wright", 5671, 44, 59 ,90));

        course.roll();
        course.average();

    }
}