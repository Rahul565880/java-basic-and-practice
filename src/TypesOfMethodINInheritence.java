// Base class
class Parent77 {

    // Inherited method
    public void inheritedMethod() {
        System.out.println("This is the inherited method from Parent.");
    }

    // Method to be overridden
    public void overriddenMethod() {
        System.out.println("This is the overridden method from Parent.");
    }
}

// Child class
class Child extends Parent77 {

    // Overriding method
    @Override
    public void overriddenMethod() {
        System.out.println("This is the overridden method in Child.");
    }

    // Child-specific method
    public void childSpecificMethod() {
        System.out.println("This is the child-specific method.");
    }
}

// Main class
public class TypesOfMethodINInheritence {

    public static void main(String[] args) {

        Child child = new Child();

        // Inherited method
        child.inheritedMethod();

        // Overridden method
        child.overriddenMethod();

        // Child-specific method
        child.childSpecificMethod();
    }
}