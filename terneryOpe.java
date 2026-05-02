import java.util.Scanner;

public class terneryOpe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age  for voting  age check:");
        int age=sc.nextInt();
        String eligible=(age>18)? "eligible":"not eligible";
        System.out.println(eligible);
    }
}
