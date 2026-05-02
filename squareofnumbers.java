import java.util.Scanner;

public class squareofnumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number :");
        int n =scan.nextInt();
        int sqr=0;
        for(int i=1;i<=n;i++){
            sqr=i*i;
            System.out.println("the square of "+ i +" is : "+sqr);


        }


    }
}

