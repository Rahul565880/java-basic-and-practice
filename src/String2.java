
    public class String2 {

        public static void main(String[] args) {

            // String literal "Rahul" is created in the String Pool
            String s1 = "Rahul";

            // Since "Rahul" already exists in the String Pool,
            // s2 points to the same object as s1
            String s2 = "Rahul";

            // '==' compares the memory addresses (references) of the objects
            if (s1 == s2) {
                System.out.println("Addresses are same");
            } else {
                System.out.println("Addresses are not same");
            }

            System.out.println("----------------------**-----------------------");

            // 'new' keyword always creates a new String object in the Heap memory
            String s3 = new String("Rahul");

            // Another new object is created in the Heap memory
            // even though the content is the same
            String s4 = new String("Rahul");

            // '==' compares the references (addresses)
            // s3 and s4 point to different objects, so this is false
            if (s3 == s4) {
                System.out.println("Addresses are same");
            } else {
                System.out.println("Addresses are not same");
            }

            System.out.println("----------------------**-----------------------");

            // equals() compares the actual content of the strings
            if (s3.equals(s4)) {
                System.out.println("Contents are same");
            } else {
                System.out.println("Contents are different");
            }
        }
    }
