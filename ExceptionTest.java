 class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

 class Father {
    public int age;

    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative.");
        }
        this.age = age;
        System.out.println("Father's age is " + this.age);
    }
}

 class Son extends Father {
    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to father's age.");
        }
    }
}

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            Father father = new Father(25);
            Son son = new Son(father.age, 26);
        } catch (WrongAge e) {
            System.out.println(e.getMessage());
        }
    }
}