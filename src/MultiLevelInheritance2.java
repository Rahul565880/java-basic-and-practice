class GrandFather {
    int land = 5;
    void showLand() {
        System.out.println("Land = " + land + " acres");
    }
}

class Father extends GrandFather {
    int house = 2;
    void showHouse() {
        System.out.println("House = " + house);
    }
}

class Son extends Father {
    int bike = 1;
    void showBike() {
        System.out.println("Bike = " + bike);
    }
}

public class MultiLevelInheritance2 {
    public static void main(String[] args) {
        Son s = new Son();
        // Method access
        s.showLand();
        s.showHouse();
        s.showBike();
    }
}