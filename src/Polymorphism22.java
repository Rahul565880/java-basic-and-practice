class Developer11 {

    void work() {
        System.out.println("Developer is working..");
    }

    void project() {
        System.out.println("Developer doing projects..");
    }
}

class JavaDeveloper11 extends Developer11 {

    @Override
    void work() {
        System.out.println("Java Developer is working..");
    }

    @Override
    void project() {
        System.out.println("Java Developer doing projects..");
    }
}

class PythonDeveloper11 extends Developer11 {

    @Override
    void work() {
        System.out.println("Python Developer is working..");
    }

    @Override
    void project() {
        System.out.println("Python Developer doing projects..");
    }
}
public class Polymorphism22 {

    public static void main(String[] args) {

        accessMethod(new JavaDeveloper11());
        accessMethod(new PythonDeveloper11());
    }

    public static void accessMethod(Developer11 ref) {
        ref.work();
        ref.project();
    }
}