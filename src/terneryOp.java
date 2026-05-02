public class terneryOp {
    public static void main(String[] args) {
        //int age=20;
        //String status = (age>=20)? "adult":"minor";
       // System.out.println(status);

        int a =10;
        int b = ++a + ++a - a++ + a++ + a--;
        System.out.println(b);
    }
}
