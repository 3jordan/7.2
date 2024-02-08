import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].codingCourse();
            students[n].addFunds();
            System.out.println(students[n].showInfo()); // Print student information
        }
    }
}
