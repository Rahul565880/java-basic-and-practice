class parent1{
    void display(){
        System.out.println("Inside the parent class ");
    }
}
class child1 extends parent{
    void display1(){
        System.out.println("Inside the child class..");
    }
}
class child2 extends child1{
    void display2(){
        System.out.println("Inside the child class 2 ..");
    }
}


public class MuiltiLevelInheritence {
    public static void main(String[] args) {
        child2 ch = new child2();
        ch.display();
        ch.display1();
        ch.display2();
    }
}
