class Student {
    private int id;
    private String name;

    public void setId(int id) {              // setter methods (to set values)
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {                                         // getter methods (to get values)
        return id;
    }
    public String getName() {
        return name;
    }
}
public class Encaps2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(101);
        s.setName("Rahul");
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
    }
}