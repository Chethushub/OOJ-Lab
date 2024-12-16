 class DisplayMessage extends Thread {
    private String message;
    private int delay;

    public DisplayMessage(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    public void run() {
        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(delay * 1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class ThreadsTest {
    public static void main(String[] args) {
        DisplayMessage dm1 = new DisplayMessage("BMSCE", 2);
        DisplayMessage dm2 = new DisplayMessage("CSE", 1);

        dm1.start();
        dm2.start();
    }
}