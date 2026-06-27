class Outer1 {

        void message() {

            class Inner {

                void show() {
                    System.out.println("Hello from Local Inner Class");
                }
            }

            Inner obj = new Inner();
            obj.show();
        }
    }

    public class LocalInnerClass {

        public static void main(String[] args) {

            Outer1 outer = new Outer1();
            outer.message();
        }
    }