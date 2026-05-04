class config{
static int a;
static {
    a=1024;
}
static void display(){
    System.out.println("configuration setting id: " + a);
}
        }

public class StaticObjectCount {
    public static void main(String[] args) {
        config.display();
    }
}

