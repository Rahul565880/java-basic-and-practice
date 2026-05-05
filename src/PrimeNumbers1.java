import java.util.Scanner;

public class PrimeNumbers1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%2==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
