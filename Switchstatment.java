import java.util.Scanner;

public class Switchstatment {
    public static void main(String[] args) {
        System.out.println("Enter your age ");
        Scanner n = new Scanner(System.in);
        int age = n.nextInt();
        switch (age){
            case 18:
                System.out.println("you are going to be adult now !");
                break;
            case 23:
                System.out.println("you are going to be join job !");
                break;
            case 60:
                System.out.println("you are going to be retaired now !");
                break;
            default:
                System.out.println("enjoy your life ");


        }
    }
}

