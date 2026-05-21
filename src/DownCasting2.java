
class parent3{
    void disp1() {
        System.out.println("Inside the parent class method  1 ");
    }
    void disp2() {
        System.out.println("Inside the parent class method 2");
    }
}
class child3 extends parent3{
    @Override
    void disp2() {
        System.out.println("Inside the child class disp2");
    }

    void disp3() {
        System.out.println("Inside child class display 3 method");
    }
}
public class DownCasting2 {

    public static void main(String[] args) {
        parent3 p = new child3();
        p.disp1();
        p.disp2();
        ((child3)(p)).disp3();// calling child specific method using down casting

    }


}
