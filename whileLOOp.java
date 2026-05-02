import java.util.Scanner;

public class whileLOOp {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number:");
        int num=n.nextInt();
        int i=1;
        while(i<=num){
            if(i%2==0){
                System.out.println("Even number :"+i);
            }
            else {
                System.out.println("odd number :"+i);
            }
            i++;
        }
    }
}
