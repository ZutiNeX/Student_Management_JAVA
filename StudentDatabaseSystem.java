import java.util.Scanner;

class StudentDatabaseSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of new Students to enroll: ");
        int numStudents = scanner.nextInt();
        System.out.println();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++){
            students[i] = new Student(scanner);

        }
        scanner.close();
    }
}
