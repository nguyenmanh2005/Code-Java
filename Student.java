package asm;

import java.util.Scanner;
import java.util.Stack;

    class Student {
        String id;
        String name;
        double marks;
        String rank;

        public Student(String id, String name, double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
            this.rank = determineRank(marks);
        }

        String determineRank(double marks) {
            if (marks < 5.0) return "Fail";
            else if (marks < 6.5) return "Medium";
            else if (marks < 7.5) return "Good";
            else if (marks < 9.0) return "Very Good";
            else return "Excellent";
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Rank: " + rank;
        }


        public Student() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMarks() {
            return marks;
        }

        public void setMarks(double marks) {
            this.marks = marks;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }
    }

