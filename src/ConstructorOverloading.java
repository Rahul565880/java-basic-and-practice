class study{
    String name;
    int roll;
    int age;

    public study() {
        name = "Rahul";
        roll=12;
        age=20;
    }
    public study(String name,int age){
        this.name=name;
        this.age=age;
    }
    public study(String name,int age,int roll){
        this.name=name;
        this.age=age;
        this.roll=roll;
    }
    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        study s1 = new study();
        s1.display();

        study s2 = new study("Ram",20);
        s2.display();

        study s3 = new study("Rakesh",20,01);
        s3.display();

    }
}
