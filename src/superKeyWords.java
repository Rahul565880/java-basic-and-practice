
class program1{
    int a = 10;
    void display() {
        System.out.println("Program1 is valid of a " + a);
        System.out.println("Inside program1 display method");
    }
}
class program2 extends program1{
    int a = 20;
    @Override
    void display() {
        System.out.println(super.a);
        System.out.println(a);
        System.out.println("inside program2 class ");

        super.display();
    }
}
public class superKeyWords {
    public static void main(String[] args ) {
        program2 p2 = new program2();
        p2.display();
    }

}
