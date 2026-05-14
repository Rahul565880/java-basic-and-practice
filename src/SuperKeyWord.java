class demo3{
 int num;
 public demo3(int num){
     this.num = num;
     System.out.println("Inside the parent class constructor");
 }
}
class demo4 extends demo3{
    int num2;
    public demo4(int num,int num2){
        super(num);
        this.num2=num2;
        System.out.println("Inside the child class constructor..");
    }
   public void display(){
        System.out.println("the number1 is: " + num);
        System.out.println("the number 2 is : " + num2);
    }
}
public class SuperKeyWord {
    public static void main(String[] args) {


        demo4 d = new demo4(2, 4);
        d.display();
    }
}
