package com.task.studentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT GRADE CALCULATOR =====");

        // Take number of subjects
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        double totalMarks = 0;

        // Input marks for each subject
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            double marks = sc.nextDouble();

            // Validate input
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--; // repeat same subject
                continue;
            }

            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = totalMarks / subjects;

        // Grade calculation
        String grade;

        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        // Display results
        System.out.println("\n===== RESULT =====");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

