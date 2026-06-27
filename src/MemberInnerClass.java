
class Outer {

    private int x = 10;

    class Inner {
       int y = 20;
        void show() {
            System.out.println("Value of x: " + x);
            System.out.println("the value of y : " + y );
        }
    }
}

public class MemberInnerClass {

    public static void main(String[] args) {

        Outer outer = new Outer();      // Create outer object
        Outer.Inner inner = outer.new Inner(); // Create inner object

        inner.show();
    }
}