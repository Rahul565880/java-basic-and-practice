import java.util.Scanner;

public class Multipleof5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        number(n);
    }
     static void number(int n){
        if(n%5==0){
            System.out.println("number is multiple of 5");
        }
        else {
            System.out.println("number is  not multiple of 5");
        }
        }
}
