
package see;

import cie.Student;

public class External extends Student {
    public int[] seeMarks = new int[5];
    public External(String usn, String name, int sem, int[] seeMarks) {
        super(usn, name, sem);
        System.arraycopy(seeMarks, 0, this.seeMarks, 0, seeMarks.length);
    }
}
