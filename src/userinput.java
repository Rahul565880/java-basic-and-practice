import java.util.Scanner;

public class userinput {
    public static void main(String args[])
    {
        System.out.println("taking user input  ");
        Scanner num = new Scanner(System.in);


        System.out.println("enter your number");
        int a = num.nextInt();

        System.out.println("enter your number 2 ");
        //int b = num.nextInt();
        float d = num.nextFloat();

        float c = a+d;
        System.out.println(c);


    }
}
