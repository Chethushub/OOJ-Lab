import java.util.*;

public class StdSgpa {
    static String USN;
    static int[] credits;
    static int[] marks;

    StdSgpa() {
        System.out.println("Welcome to the SGPA Calculator.");
    }

    static void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();
        credits = new int[n];
        marks = new int[n];

        System.out.print("Enter the USN: ");
        sc.nextLine(); // Consume newline
        USN = sc.nextLine();

        System.out.println("Enter the credits and marks for each subject:");
        for (int i = 0; i < n; i++) {
            System.out.print("Credits for subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();
            System.out.print("Marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }

    static double sgpa() {
        int totalPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < credits.length; i++) {
            int gradePoints;
            if (marks[i] >= 90) gradePoints = 10;
            else if (marks[i] >= 80) gradePoints = 9;
            else if (marks[i] >= 70) gradePoints = 8;
            else if (marks[i] >= 60) gradePoints = 7;
            else if (marks[i] >= 50) gradePoints = 6;
            else if (marks[i] >= 40) gradePoints = 5;
            else gradePoints = 0;

            totalPoints += credits[i] * gradePoints;
            totalCredits += credits[i];
        }

        if (totalCredits == 0) return 0;

        return (double) totalPoints / totalCredits;
    }

    static void display() {
        System.out.println("\nUSN: " + USN);
        System.out.println("Subject-wise Details:");

        for (int i = 0; i < credits.length; i++) {
            System.out.printf("Subject %d - Credits: %d, Marks: %d%n", (i + 1), credits[i], marks[i]);
        }

        System.out.printf("\nSGPA: %.2f%n", sgpa());
    }

    public static void main(String[] args) {
        StdSgpa calculator = new StdSgpa();
        accept();
        display();
    }
}
