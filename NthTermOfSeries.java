import java.util.Scanner;

public class NthTermOfSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = scan.nextInt();
        int term = 0;
        for (int i=1;i<=n;i++){
            term=term+i;
        }
        System.out.println(term);
    }
}

