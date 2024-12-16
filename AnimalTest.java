abstract class Animal {
     abstract void eat();
     abstract void sleep();

}

 class Lion extends Animal {
     void eat() {
        System.out.println("Lion eats raw meat.");
    }

     void sleep() {
        System.out.println("Lion sleeps in night.");
    }
}

 class Tiger extends Animal {
     void eat() {
        System.out.println("Tiger eats raw meat.");
    }

     void sleep() {
        System.out.println("Tiger sleeps in night.");
    }
}

 class Deer extends Animal {
     void eat() {
        System.out.println("Deer eats grass as a food.");
    }

     void sleep() {
        System.out.println("Deer sleeps in night and roam in day time.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Deer d = new Deer();
        Lion l = new Lion();
        Tiger t = new Tiger();

        d.eat();
        d.sleep();

        l.eat();
        l.sleep();

        t.eat();
        t.sleep();
    }
}