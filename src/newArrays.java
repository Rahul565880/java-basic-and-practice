
import java.util.*;
import java.util.Arrays;

public class newArrays {

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the size of the arrays");
            int s = sc.nextInt();
            int[] arr = new int[s];

            System.out.println("enter the elements to store");
            for(int i=0; i<s; i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));

        }

    }

