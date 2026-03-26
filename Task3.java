public class Task3 {
    static String a = "Wow" ;
    static String b = "Wow";
    static String c = "";
    static String d = "Wow!";

    static boolean b1 = a == b;
    static boolean b2 = d.equals(b + "!");
    static boolean b3 = !c.equals(a);

     static void main() {
        if (b1 && b2 && b3) {
            System.out.println("Success");
        }
    }
}