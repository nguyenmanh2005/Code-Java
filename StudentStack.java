package asm;
import java.util.Arrays;
import java.util.Comparator;

class StudentStack {
    private Node top;
    private int size;

    // Constructor
    public StudentStack() {
        top = null;
        size = 0;
    }


    // Push a student onto the stack
    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Inserted: " + student);
    }


    // Pop a student from the stack
    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No students to remove.");
            return null;
        }
        Student poppedStudent = top.student;
        top = top.next;
        size--;
        return poppedStudent;
    }


    // Peek at the top student
    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return top.student;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        if (top == null) {
            System.out.println("null.");
            return true;
        } else {
            System.out.println("Not null: " + top.student);
            return false;
        }
    }

    // Get the size of the stack
    public int size() {
        System.out.println("Size student:" + size);
        return size;
    }

    // Display all students in the stack
    public void displayStudents() {
        if (isEmpty()) {
            System.out.println("No students in the stack.");
            return;
        }

        System.out.println("Students in Stack:");
        Node current = top;  // Start from the top node
        while (current != null) {
            System.out.println(current.student);
            current = current.next; // Move to the next node
        }
    }

    public void deleteStudentById(String id) {
        if (isEmpty()) {
            System.out.println("No students to delete.");
            return;
        }

        Node current = top;
        Node previous = null;
        String idString = String.valueOf(id); // Convesrt to string

        while (current != null) {
            if (current.student.getId().equals(idString)) { // use phương thức equals() to ss chuỗi
                if (previous == null) {
                    top = current.next; // Delete the top student
                } else {
                    previous.next = current.next;
                }
                size--;
                System.out.println("Deleted student with ID: " + id);
                return;
            }
            previous = current;
            current = current.next;
        }

        System.out.println("Student with ID " + id + " not found.");
    }

    // Edit a student's information by ID
    public void editStudentById(String id, String newName, double newMarks) {
        Node current = top;

        while (current != null) {
            if (current.student.getId().equals(id)) { // Ss live to id chuỗi
                if (!newName.isEmpty()) {
                    current.student.setName(newName); // edit name if not nul
                }
                current.student.setMarks(newMarks); // edit mark
                System.out.println("Edited student with ID: " + id);
                return;
            }
            current = current.next;
        }

        System.out.println("Student with ID " + id + " not found.");
    }



    public Student searchStudentById(String id) { //convesrt int to string
        Node current = top;

        while (current != null) {
            if (current.student.getId().equals(id)) { // use() để ss chuỗi
                return current.student;
            }
            current = current.next;
        }

        System.out.println("Student with ID " + id + " not found.");
        return null;
    }


    // Sort students in ascending order based on marks


    public void sortAscending() {
        if (size <= 1) return;

        Node current = top;
        Node index = null;
        Student temp;

        // puble sort
        for (int i = 0; i < size - 1; i++) {
            current = top;
            for (int j = 0; j < size - 1 - i; j++) {
                index = current.next;
                if (current.student.getMarks() > index.student.getMarks()) {
                    // Hoán đổi hai phần tử
                    temp = current.student;
                    current.student = index.student;
                    index.student = temp;
                }
                current = current.next;
            }
        }

        System.out.println("Stack sorted in ascending order by marks:");
        current = top; // Đặt lại current về đầu stack
        while (current != null) {
            System.out.println(current.student); // In ra từng sinh viên
            current = current.next; // Di chuyển đến node tiếp theo
        }
    }}





/*
public class StudentStack {
    Stack<Student> stack = new Stack<>();

    public void push(Student student) {
        stack.push(student);
    }


    public void pop() {
        if (!stack.isEmpty()) {
            System.out.println("Removed: " + stack.pop());
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public void peek() {
        if (!stack.isEmpty()) {
            System.out.println("Top of the stack: " + stack.peek());
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public void edit(String id, String newName, double newMarks) {
        Stack<Student> tempStack = new Stack<>();
        boolean found = false;

        while (!stack.isEmpty()) {
            Student student = stack.pop();
            if (student.id.equals(id)) {
                student.name = newName;
                student.marks = newMarks;
                student.rank = student.determineRank(newMarks);
                found = true;
            }
            tempStack.push(student);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        if (found) {
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void delete(String id) {
        Stack<Student> tempStack = new Stack<>();
        boolean found = false;

        while (!stack.isEmpty()) {
            Student student = stack.pop();
            if (student.id.equals(id)) {
                System.out.println("Deleted: " + student);
                found = true;
                continue;
            }
            tempStack.push(student);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void search(String id) {
        Stack<Student> tempStack = new Stack<>();
        boolean found = false;

        while (!stack.isEmpty()) {
            Student student = stack.pop();
            if (student.id.equals(id)) {
                System.out.println("Found: " + student);
                found = true;
            }
            tempStack.push(student);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void displayAll() {
        Stack<Student> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            Student student = stack.pop();
            System.out.println(student);
            tempStack.push(student);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public void sortmarks() {
        List<Student> tempList = new ArrayList<>(stack);
        Collections.sort(tempList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.marks < o2.marks) {
                    return 1;
                } else if (o1.marks > o2.marks) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        stack.clear();
        for (Student student : tempList) {
            stack.push(student);
        }
        System.out.println("List of students after sorting by descending score:");
        for (Student student : stack) {
            System.out.println("ID: " + student.id + ", Tên: " + student.name + ", Điểm: " + student.marks);

        }
    }


    public void numberofstudent(){
        int count = this.stack.size();
        System.out.println("The total number of students on the list is:" +count);

    }

    public void delete() {
        this.stack.removeAll(stack);
    }

*/


