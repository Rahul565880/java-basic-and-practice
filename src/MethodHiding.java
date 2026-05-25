class Parents{
    static void display1() {
        System.out.println("Inside the parent class display 1");
    }

    static void display2() {
        System.out.println("Inside the parent class display 2");
    }
}

class childs extends Parents {

    static void display2() {// accessing parent class static method same as in child class this process is called as method hiding..
        System.out.println("	INSIDE THE CHILD CLASS DISPLAY 2");
    }

}
public class MethodHiding {

    public static void main(String[] args) {
        Parents p = new Parents();// matheod hiding only see the reference of object rether then the object
        p.display1();
        p.display2();

        Parents p1 = new childs();// mtheod hiding only see the reference of object rether then the object
        p1.display1();
        p1.display2();


        childs ch = new childs();
        ch.display1();
        ch.display2();
    }

}
