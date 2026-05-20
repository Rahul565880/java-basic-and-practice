class Order { // polymorphism...
    public void prepare() {
        System.out.println("Order is being prepared!");
    }
    public void serve() {
        System.out.println("Order served to the customer!");
    }
    public void bill() {
        System.out.println("Bill prepared for the order!");
    }
}

public class Polymorph {
    public static void main(String[] args) {
        Order myOrder = new Order();
        new Polymorph().processOrder(myOrder);
    }

    public void processOrder(Order order) { //poly method  where it can create object and we can call
        order.prepare();
        order.serve();
        order.bill();
    }
}