 import cie.*;
import see.*;
import java.util.*;

public class Exams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = in.nextInt();
        in.nextLine(); 

        Student[] s = new Student[n];
        Internals[] ie = new Internals[n];
        External[] ee = new External[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1));

            System.out.print("Enter USN: ");
            String usn = in.nextLine();

            System.out.print("Enter Name: ");
            String name = in.nextLine();

            System.out.print("Enter Semester: ");
            int sem= in.nextInt();

            System.out.print("Enter internal marks for 5 subjects: ");
            int[] intMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                intMarks[j] = in.nextInt();
            }

            System.out.print("Enter SEE marks for 5 subjects: ");
            int[] seeMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                seeMarks[j] = in.nextInt();
            }

            in.nextLine(); 

            s[i] = new Student(usn, name, sem);
            ie[i] = new Internals(intMarks);
            ee[i] = new External(usn, name, sem, seeMarks);
        }

        System.out.println("\nFinal marks of each student:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " (" + s[i].name + "):");
            for (int j = 0; j < 5; j++) {
                int finalMarks = ie[i].intMarks[j] + (ee[i].seeMarks[j] / 2);
                System.out.println("Course " + (j + 1) + ": " + finalMarks);
            }
            System.out.println();
        }

        in.close();
    }
}
