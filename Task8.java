public class Task8 {
    static int total;
    public static void main(String[] args) {
        processNumbers(4, 5, 10);
    }

    static void processNumbers(int... numbers) {
        for(int num : numbers){
            total += num;
        }
        System.out.println("the sum of all parameters is:" + total);

        int totalSum = 0;

        for (int num : numbers) {
            int cumulativeSum = num * (num + 1) / 2; // Sum of 1 to num
            System.out.println("Parameter: " + num + ", Cumulative Sum: " + cumulativeSum );
        }
    }
}