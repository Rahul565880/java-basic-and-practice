class block{
    static{
        System.out.println("1st static block");
    }
    static{
        System.out.println("2nd static block");
    }
    static{
        System.out.println("3rd static block");
    }

    {
        System.out.println("hello from non static block");
    }
    {
        System.out.println("hello  2 from non static block");
    }

}
public class StaticBlocks {
    public static void main(String[] args) {
        block b = new block();

        block b2 = new block();
    }

}
