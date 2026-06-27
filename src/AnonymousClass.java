
    abstract class Animal {

        abstract void sound();

        void eat() {
            System.out.println("Animal is eating");
        }
    }

    public class AnonymousClass {

        public static void main(String[] args) {

            Animal obj = new Animal() {

                @Override
                void sound() {
                    System.out.println("Dog barks");
                }
            };

            obj.sound();
            obj.eat();
        }


    }

