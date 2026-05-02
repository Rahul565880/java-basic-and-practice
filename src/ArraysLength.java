public class ArraysLength {
    public static void main(String[] args) {
        int [] marks3={20,30,50,60,80,90};
        //displyaing the arrays
        System.out.println("displyaing the arrays");
        for(int i=0;i<marks3.length;i++){
            System.out.println(marks3[i]);

        }
        System.out.println(" ");
        //diplyaing or printing arrays in revers order
        System.out.println("diplyaing or printing arrays in revers order");
        for(int i= marks3.length-1;i>=0;i--){
            System.out.println(marks3[i]);
        }
        System.out.println("displyaing the arrays using for each loop ");
        for(int element:marks3){
            System.out.println(element);
        }


        //System.out.println(marks3.length);
        //System.out.println(marks3[3]);




        /*  String [] names={"rahul","ganesh","prem","hind"};
        System.out.println(names.length);
        System.out.println(names[3]);  */
    }
}
