import java.util.Scanner;

public class cubeofNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number :");
        int n =scan.nextInt();
        int cube=0;
        for(int i=1;i<=n;i++){
            cube=i*i*i;
            System.out.println("the cube of "+ i+" is : "+cube);


        }


    }
}

