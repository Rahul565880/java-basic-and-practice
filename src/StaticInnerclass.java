
    class prg1{
        int c = 10;
        static class prg2{
            static int d = 10;
            static void d1() {
                System.out.println(d);
            }
        }
        void d2() {
            System.out.println(c);
            prg2.d1();
        }
    }
    public class StaticInnerclass {

        public static void main(String[] args) {
            prg1 p1 = new prg1();
            p1.d2();
            prg1.prg2.d1();

        }

    }
