import java.util.Scanner;
public class Task5 {

    static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your second numbers");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your third numbers");
        int num3 = Integer.parseInt(scanner.nextLine());

        if (num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal.");
        }else{
            int largestNum = num1;

            if(num2 > largestNum){
                largestNum = num2;
            }
            if(num3 > largestNum){
                largestNum = num3;
            }

            System.out.println("the largest number is: "+ largestNum);
        }


        scanner.close();
    }
}
