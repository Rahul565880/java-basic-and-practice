class SApp{

    String name;
    int marks;

    SApp(String n, int m) {
        name = n;
        marks = m;
    }

    void display() {
        System.out.println(name + " " + marks);
    }
}

public class Constructor2 {
    public static void main(String[] args) {

        SApp s1 = new SApp("Rahul", 90);
        SApp s2 = new SApp("Aman", 85);

        s1.display();
        s2.display();
    }
}