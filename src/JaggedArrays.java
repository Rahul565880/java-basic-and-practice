
import java.util.Scanner;

public class JaggedArrays {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            // Creating a 2D Jagged Array with 3 rows
            int a[][] = new int[3][];
            a[0] = new int[3];
            a[1] = new int[4];
            a[2] = new int[2];

            System.out.println("Enter the Array Elements :");

            // Loop to read user inputs
            for(int i=0; i<=a.length-1; i++)
            {
                for(int j=0; j<=a[i].length-1; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }

            System.out.println("Array Elements are :");

            // Loop to print the elements
            for(int i=0; i<=a.length-1; i++)
            {
                for(int j=0; j<=a[i].length-1; j++)
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }