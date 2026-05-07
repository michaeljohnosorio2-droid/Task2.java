public class TaskSheet113 {
   static int check_number = 10;
   static String message;

    static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(message =(i%2==0) ? i+ " is even number." : i+ " is odd number." );
            i++;
        } while (i <= check_number);
    }
}
