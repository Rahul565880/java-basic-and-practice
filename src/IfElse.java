import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("enter your age :");
        Scanner age=new Scanner(System.in);
       int age1=age.nextInt();
       if(age1>18){
           System.out.println("you can drive ");

       }
       else {
           System.out.println("you cant drive");
       }
    }
}
