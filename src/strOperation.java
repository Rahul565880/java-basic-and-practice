import java.sql.SQLOutput;

public class strOperation {

        public static void main(String[] args) {
            String s1 = "Rahul Pawar";
            System.out.println(s1.toLowerCase());
            System.out.println(s1.toUpperCase());
            System.out.println(s1.charAt(3));
            System.out.println(s1.contains("Pa"));
            System.out.println(s1.endsWith("Rah"));
            System.out.println(s1.endsWith("ar"));
            System.out.println(s1.startsWith("Rah"));
            System.out.println(s1.startsWith("ul"));
            System.out.println(s1.indexOf('l'));
            System.out.println(s1.lastIndexOf('r'));
            System.out.println(s1.indexOf('P'));
            System.out.println(s1.isEmpty());
            System.out.println(s1.isBlank());
            System.out.println(s1.replace(' ', 's'));
            System.out.println(s1.substring(5));
            System.out.println(s1.substring(0, 6));
            System.out.println("---------------------------------------------------------------");
            System.out.println(s1.concat("s"));


            System.out.println(s1.lastIndexOf('r'));

        }

    }
