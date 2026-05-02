public class pattern5 {
    public static void main(String[] args) {
        for (int i =1;i<=10;i++){
            if (i==6){
                break;
            }
            for (int j=1;j<=10-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


