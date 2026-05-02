import java.util.Scanner;

public class squerOfnaturalnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number :");
        int n =scan.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i*i;

        }
        System.out.println("sum of natural number is "+sum);

    }
}

