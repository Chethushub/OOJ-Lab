
package cie;

public class Internals {
    public int[] intMarks = new int[5]; 
    public Internals(int[] marks) {
        System.arraycopy(marks, 0, intMarks, 0, marks.length);
    }
}
