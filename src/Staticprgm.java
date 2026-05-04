class Car{
    static void convertKmtoMiles(){
        System.out.println("converting km into miles...");
    }
    void calculateMilage(){
        System.out.println("calculating the milage...");
    }
}

public class Staticprgm {
    public static void main(String[] args) {
        Car nano =  new Car();
        nano.calculateMilage();

        Car nexon = new Car();
        nexon.calculateMilage();

        Car bmw = new Car();
        bmw.calculateMilage();


        Car.convertKmtoMiles();
    }
}
