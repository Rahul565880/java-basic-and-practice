public class Break {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
 //           if(i%2==0){   prints the odd number between ....
            if(i %2 !=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
