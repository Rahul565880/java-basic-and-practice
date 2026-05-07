class M1{
    String name;
    int age;
    double height;

    M1(String Name,int Age,double Height){
        name=Name;
        age=Age;
        height=Height;
    }
    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class Constructorsprgm {
    public static void main(String[] args) {
        M1 s1 = new M1("Rahul",20,5.9);
        s1.display();
    }
}
