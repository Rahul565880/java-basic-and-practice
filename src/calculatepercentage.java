import java.util.Scanner;

public class calculatepercentage {
    public static void main(String[] args) {
        System.out.println("calculating the percentage of the all subjects ");
        Scanner s = new Scanner(System.in);

        System.out.println("enter number of marks in the maths ");
        int math = s.nextInt();

        System.out.println("enter number of marks in the science ");
        int science = s.nextInt();

        System.out.println("enter number of marks in the hindi ");
        int hindi  = s.nextInt();

        System.out.println("enter number of marks in the kannada ");
        int kannada= s.nextInt();

        System.out.println("enter number of marks in the social ");
        int social = s.nextInt();

        System.out.println("enter number of marks in the drawing ");
        int drawing = s.nextInt();

        int total=math+science+hindi+kannada+social+drawing;
         float percentage= (total/600.0f)*100;
        System.out.println(percentage);

    }
}
