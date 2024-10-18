package asm;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentStack studentStack = new StudentStack();
        int choice;

        do {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Pop Student");
            System.out.println("7. Peek Student");
            System.out.println("8. Sort");
            System.out.println("9. Delete all data");
            System.out.println("9. Isempty");
            System.out.println("10. Number of student in list");
            System.out.println("0. Exit");

            System.out.print("Select service from list: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {

                case 1: // add
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student Marks: ");
                    double marks = scanner.nextDouble();
                    studentStack.push(new Student(id, name, marks));
                    break;
                case 2: // edit
                    System.out.print("Enter Student ID to edit: ");
                    String editId = scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new marks: ");
                    double newMarks = scanner.nextDouble();
                    studentStack.editStudentById(editId, newName, newMarks);
                    break;
                case 3: //delete
                    System.out.print("Enter Student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    studentStack.deleteStudentById(deleteId);
                    break;
                case 4: // search
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();
                    studentStack.searchStudentById(searchId);
                    break;
                case 5: // show all student
                    studentStack.displayStudents();
                    break;
                case 6:
                    studentStack.pop();
                    break;
                case 7:
                    studentStack.peek();
                    break;
                case 8:
                    studentStack.sortAscending();

                    break;
                case 9:
                    studentStack.isEmpty();
                    break;
                case 10:
                    studentStack.size();
                    break;
                case 0: // out
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        scanner.close();
        // stackChuoi.push("giatri") => đưa giá trị vào stack
        // stackChuoi.pop() => lấy giá trị ra, xóa khỏi stack
        // stackChuoi.peek() => lấy giá trị ra, nhưng không xóa khỏi stack
        // stackChuoi.clear(); => xóa tất cả phần tử trong stack
        // stackChuoi.contains("giatri")=> xác định giá trị có tồn tại trong stack hay không
        // stackChuoi.size() => độ lớn của stack
    }
}






















