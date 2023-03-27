import java.util.Scanner;

import implementations.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<StudentNode> students = new SinglyLinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 8) {
            System.out.println("STUDENT MANAGEMENT SYSTEM");
            System.out.println("|1| Add a student to the head of the current list");
            System.out.println("|2| Add a student to the tail of the current list");
            System.out.println("|3| Remove a student from the head of the current list");
            System.out.println("|4| Remove a student from the tail of the current list");
            System.out.println("|5| Get the student at the head of the current list");
            System.out.println("|6| Get the student at the tail of the current list");
            System.out.println("|7| Retrieve all students in the current list");
            System.out.println("|8| Exit the program");
            System.out.print("    Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student id: ");
                    String id = scanner.next();
                    System.out.println("Enter student name: ");
                    String name = scanner.next();
                    System.out.println("Enter student major: ");
                    String major = scanner.next();
                    System.out.println("Enter student GPA: ");
                    double gpa = scanner.nextDouble();
                    students.addFirst(new StudentNode(id, name, major, gpa));
                    break;
                case 2:
                    System.out.println("Enter student id: ");
                    id = scanner.next();
                    System.out.println("Enter student name: ");
                    name = scanner.next();
                    System.out.println("Enter student major: ");
                    major = scanner.next();
                    System.out.println("Enter student GPA: ");
                    gpa = scanner.nextDouble();
                    students.addLast(new StudentNode(id, name, major, gpa));
                    break;
                case 3:
                    students.removeFirst();
                    break;
                case 4:
                    students.removeLast();
                    break;
                case 5:
                    System.out.println(students.getFirst());
                    break;
                case 6:
                    System.out.println(students.getLast());
                    break;
                case 7:
                    System.out.println(students.toString());
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}