import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Initialize arrays to store student names and their grades
        // Assuming a maximum of 100 students
             String[] studentNames = new String[100];
             int[] studentGrades = new int[100];
        // To keep track of the number of students
            int numberOfStudents = 0;  
        
        while (true) {
            System.out.println("Student Grade Tracker Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. View list of students and grades");
            System.out.println("3. Calculate and display average grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the student's name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter the student's grade: ");
                    int grade = sc.nextInt();
                    
                    // Add the student and grade to the arrays

                    studentNames[numberOfStudents] = name;
                    studentGrades[numberOfStudents] = grade;
                    numberOfStudents++;
                    System.out.println("Student added successfully.");
                    break;
                    
                case 2:
                    System.out.println("List of students and their grades:");
                    for (int i = 0; i < numberOfStudents; i++) {
                        System.out.println(studentNames[i] + ": " + studentGrades[i]);
                    }
                    break;
                    
                case 3:
                    // Calculate and display the average grade

                    int totalGrade = 0;
                    for (int i = 0; i < numberOfStudents; i++) {
                        totalGrade += studentGrades[i];
                    }
                    double averageGrade = (double) totalGrade / numberOfStudents;
                    System.out.println("Average grade: " + averageGrade);
                    break;
                    
                case 4:
                    System.out.println("Exiting Student Grade Tracker.");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
