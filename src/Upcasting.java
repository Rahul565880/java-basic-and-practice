class Developer{
    void work() {
        System.out.println("devloper is working..");
    }
    void project() {
        System.out.println("Developer doing projects..");
    }

}
class JavaDeveloper extends Developer{
    @Override
    void work() {
        System.out.println("Java devloper is working..");
    }
    @Override
    void project() {
        System.out.println("Java Developer doing projects..");
    }
}
class PythonDeveloper extends Developer{
    @Override
    void work() {
        System.out.println("Python devloper is working..");
    }
    @Override
    void project() {
        System.out.println("Python Developer doing projects..");
    }
}
public class Upcasting{

    public static void main(String[] args) {

        Developer dev1 = new JavaDeveloper();
        dev1.work();
        dev1.project();


        Developer dev2 = new PythonDeveloper();
        dev2.work();
        dev2.project();



    }

}