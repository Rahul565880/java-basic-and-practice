class Std{
    String name;
    int age;
    double per;


    Std(String name,int age , double per){
        this.name=name;
        this.age=age;
        this.per=per;
    }
    void display() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.per);

    }
}
public class ThisKeyWord {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Std s = new Std("Rahul",21,98.0);
        s.display();
    }

}