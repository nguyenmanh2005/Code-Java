package asm;

public class StudentManagement {
    StudentStack studentStack;
    public  StudentManagement(){
        studentStack = new StudentStack();
    }
    public void addStudent(Student student)
    {
    }
}


   /* public StudentManagement(StudentStack studentStack) {
        this.studentStack = studentStack;
    }*/

    /*public class StudentStack {
        private Student[] stack;
        private int top;
        private int capacity;

        public StudentStack() {
            this.capacity = capacity;
            this.stack = new Student[capacity];
            this.top = -1;
        }

        public void push(Student student) {
            if (top >= capacity - 1) {
                System.out.println("Stack is full, cannot add more students.");
                return;
            }
            stack[++top] = student;
        }

        public void pop() {
            if (top == -1) {
                System.out.println("Stack is empty.");
            } else {
                System.out.println("Removed: " + stack[top--]);
            }
        }

        public void peek() {
            if (top == -1) {
                System.out.println("Stack is empty.");
            } else {
                System.out.println("Top of the stack: " + stack[top]);
            }
        }

        public void edit(String id, String newName, double newMarks) {
            boolean found = false;

            for (int i = 0; i <= top; i++) {
                if (stack[i].id.equals(id)) {
                    stack[i].name = newName;
                    stack[i].marks = newMarks;
                    stack[i].rank = stack[i].determineRank(newMarks);
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Student updated successfully.");
            } else {
                System.out.println("Student with ID " + id + " not found.");
            }
        }

        public void delete(String id) {
            int indexToDelete = -1;

            for (int i = 0; i <= top; i++) {
                if (stack[i].id.equals(id)) {
                    indexToDelete = i;
                    break;
                }
            }

            if (indexToDelete != -1) {
                System.out.println("Deleted: " + stack[indexToDelete]);

                for (int i = indexToDelete; i < top; i++) {
                    stack[i] = stack[i + 1];
                }
                stack[top--] = null;
            } else {
                System.out.println("Student with ID " + id + " not found.");
            }
        }

        public void search(String id) {
            boolean found = false;

            for (int i = 0; i <= top; i++) {
                if (stack[i].id.equals(id)) {
                    System.out.println("Found: " + stack[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student with ID " + id + " not found.");
            }
        }

        public void displayAll() {
            if (top == -1) {
                System.out.println("Stack is empty.");
                return;
            }

            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }

        public void sortMarks() {

            for (int i = 0; i <= top - 1; i++) {
                for (int j = 0; j <= top - 1 - i; j++) {
                    if (stack[j].marks < stack[j + 1].marks) {

                        Student temp = stack[j];
                        stack[j] = stack[j + 1];
                        stack[j + 1] = temp;
                    }
                }
            }

            System.out.println("List of students after sorting by descending score:");
            displayAll();
        }

        public void numberOfStudents() {
            System.out.println("The total number of students on the list is: " + (top + 1));
        }

        public void deleteAll() {
            for (int i = 0; i <= top; i++) {
                stack[i] = null;
            }
            top = -1;
            System.out.println("All student data has been deleted.");
        }

*/

/*
}}*/
