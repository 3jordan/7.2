import java.util.Random;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String leadershipTeam;
    private String courses = "";
    private int gasCard = 70;
    private String birthDate;
    int student_id = 0;
    int totalBalance = 0;

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("Enter student birth date(format ex: January 1): ");
        this.birthDate = in.nextLine();

        setTeam();


    }

    private String setTeam(){
        student_id = student_id + 1;
        if (student_id == 0){
            leadershipTeam = "Procurement";
        }
        else if (student_id == 1){
            leadershipTeam = "Documentation";
        }
        else if (student_id == 2){
            leadershipTeam = "Management";
        }
        else if (student_id == 3){
            leadershipTeam = "Community";
        }
        else{
            student_id = 0;
        }
        return  leadershipTeam;
    }

    public void codingCourse() {
        do {
            System.out.println("Enter course to enroll(Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
            } else {
                break;
            }
        } while (true);
    }

    public void gasCard(){
        Random rand = new Random();
        int subtractedAmount = rand.nextInt(50);
        gasCard -= subtractedAmount;
        System.out.println("Balance: $" + gasCard);
    }

    public void addFunds(){
        System.out.println("Enter your payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        System.out.println(payment + " has been added");
        gasCard += payment;
        gasCard();
    }

    public String showInfo(){
        return "Name: " + firstName + " " + lastName + "\nCourses Enrolled: " + courses + "\nBirthday: " + birthDate + "\nLeader Ship Team: " + leadershipTeam;
    }

}
