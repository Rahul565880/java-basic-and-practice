import java.util.Scanner;

public class primeNumber__ {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number :");

        int n = scan.nextInt();

        if(n == 1)

        {

            System.out.println("NOT aprime number");

        }

        else

        {

            findPrime(n);

        }

    }



    static void findPrime(int n)

    {

        int count = 0;



        for(int i=2; i<=Math.sqrt(n);i++)

        {

            if(n%i == 0)

            {

                count++;

            }

        }



        if(count == 0)

        {

            System.out.println("Prime Number");

        }

        else

        {

            System.out.println("NOT-prime number");

        }

    }

}