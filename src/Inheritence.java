class parent{
    void display(){
        System.out.println("Inside the parent class ");
    }
}
class child extends parent{

}

public class Inheritence {
    public static void main(String[] args) {
        child ch = new child();
        ch.display();
    }
}

