class Employee {

    String name;
    int id;
    double salary;

    Employee() {
        this("Unknown", 0, 0.0);
    }

    Employee(String name) {
        this(name, 101, 25000);
    }

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
        System.out.println();
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Rahul");
        Employee e3 = new Employee("Amit", 201, 50000);

        e1.display();
        e2.display();
        e3.display();
    }
}