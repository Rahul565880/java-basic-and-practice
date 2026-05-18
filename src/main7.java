class Parent {

    final void display() {
        System.out.println("Final method from Parent class");
    }
}

class Child1 extends Parent {

    void show1() {
        System.out.println("Child1 class method");
    }
}

class Child2 extends Parent {

    void show2() {
        System.out.println("Child2 class method");
    }
}

public class main7 {
    public static void main(String[] args) {

        Child1 c1 = new Child1();
        c1.display();
        c1.show1();

        System.out.println();

        Child2 c2 = new Child2();
        c2.display();
        c2.show2();
    }
}