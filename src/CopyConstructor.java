class main1{
    String name;
    int roll;


    public  main1(String name,int roll) {
        this.name=name;
        this.roll=roll;
    }
    public main1(main1 ref) {
        this.name=ref.name;
        this.roll=ref.roll;
    }
    public void display() {
        System.out.println(name);
        System.out.println(roll);
    }
}
public class CopyConstructor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        main1 m = new main1("Rahul",20);
        m.display();

        main1 m2 = new main1(m);
        m2.display();

    }

}
