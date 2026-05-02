import java.util.Scanner;

public class sumOfodd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number :");
        int n =scan.nextInt();
        int oddsum=0;
        for(int i=1;i<=n;i++) {
            if (i % 2 != 0) {


                oddsum = oddsum + i;
            }
        }
        System.out.println(oddsum);
}
}
