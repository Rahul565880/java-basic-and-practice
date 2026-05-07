class car {
    String brand;
    int price;

    car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println(brand);
        System.out.println(price);
    }
}

public class Constr {
    public static void main(String[] args) {

        car c1 = new car("BMW", 5000000);

        c1.display();
    }
}