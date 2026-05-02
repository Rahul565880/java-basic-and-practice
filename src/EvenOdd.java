import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a numebr ");
        Scanner num = new Scanner(System.in);
        int number=num.nextInt();
        if(number%2==0){
            System.out.println("given numvber is even");

        }
        else {
            System.out.println("the given number is odd");
        }
    }
}
