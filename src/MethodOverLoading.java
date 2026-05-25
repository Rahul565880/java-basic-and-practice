

class overLoad{
    int add(int a, int b) {
        return  a + b;
    }
    double add(int a, double b) {
        return  a + b;
    }

    double add(double a, double b) {
        return  a + b;
    }

    int add(int a, int b,int c) {
        return  a + b + c;
    }

    double add(int a, double b,int c) {
        return  a + b + c;
    }
}
public class MethodOverLoading {

    public static void main(String[] args) {
        overLoad ld = new overLoad();
        System.out.println(ld.add(10, 20));
        System.out.println(ld.add(10.4, 30.5));
        System.out.println(ld.add(12, 30.5));
        System.out.println(ld.add(12, 30, 20));
    }

}

