class parent22{
    public parent22(){
        System.out.println("Inside the parent class constructor excuted");
    }
}
class child23 extends parent22{
    public child23(){
        System.out.println("Inside the child class 1 constructor excuted");
    }

}
 class child24 extends child23{
    public child24(){
        System.out.println("Inside the child class 2 constructor excuted");
    }
 }

public class SuperKeywordImplicitCalling {
    public static void main(String[] args) {
        child24 ch = new child24();
    }
}
