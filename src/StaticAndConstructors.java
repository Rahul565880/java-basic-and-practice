class demo1{
    static {
        System.out.println("Static block excuted .......");
    }
    {
        System.out.println("Non Static block excuted .......");
    }
    public demo1(){
        System.out.println("Constructor will excuted....");
    }
}

public class StaticAndConstructors {
    public static void main(String[] args) {


        demo1 d1 = new demo1();

        // see the output when we create the onther object

        demo1 d2 = new demo1();
    }
}
