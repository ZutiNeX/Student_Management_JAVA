import java.util.Scanner;

class Student {

    private String firstname;
    private String lastname;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int numberOfCourses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    Student(Scanner scanner) {

        setStudentDetails(scanner);
        enrollCourse();
        payTuition(scanner);
        System.out.println(showInfo());

        System.out.println();
        System.out.println();

    }

    public Student() {

    }

    private void setStudentDetails(Scanner scanner){
        System.out.println("Enter first name: ");
        this.firstname = scanner.next();

        System.out.println("Enter last name: ");
        this.lastname = scanner.next();

        System.out.println();

        System.out.print("1. Freshmen\n2. Sophmore\n3. Junior\n4. Senior \nEnter the grade year for " + this.firstname + ":");
        this.gradeYear = scanner.nextInt();

        setStudentID();
        System.out.println();
    }

    private void setStudentID(){
        Student.id++;
        this.studentID = this.gradeYear + "" + Student.id;

    }

    private void enrollCourse(){
        Scanner scanner = new Scanner(System.in);
        while(1!=0){
            System.out.print("Enter the course that you wanna study(Q to quit): ");
            String c = scanner.nextLine();
            if(!(c.equals("Q") || c.equals("q"))){
                this.courses = courses + "\n  " + c;
                this.tuitionBalance += Student.costOfCourse;
                this.numberOfCourses += 1;
            }
            else{
                break;
            }
        }

        System.out.println();
        System.out.println(
                "Total course amount = " + this.numberOfCourses + " x £" + Student.costOfCourse + " = £" + this.tuitionBalance);
    }

    private void viewBalance(){
        System.out.println("Your tuition balance: £" + this.tuitionBalance);
    }

    private void payTuition(Scanner scanner){
        viewBalance();
        System.out.print("Please Enter the amount you wanna pay today: £");
        int payment = scanner.nextInt();
        this.tuitionBalance = this.tuitionBalance - payment;

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("Thank you for the payment of £" + payment);
        viewBalance();
        System.out.println("-----------------------------------------");

    }

    private String showInfo(){
        return("Name: " + this.firstname + " " + this.lastname +
                "\nStudentID: " + this.studentID +
                "\nYear Level: "+ this.gradeYear +
                "\nCourses Enrolled: " + this.courses +
                "\nBalance: £" + this.tuitionBalance);
    }
}