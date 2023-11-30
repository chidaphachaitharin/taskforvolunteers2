import java.util.Arrays;
import java.util.Scanner;

public class TASK3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n between 1 and 100 : ");
        int n = sc.nextInt();

        int[] result = ZeroSumArray(n);

        System.out.println("Generated random array with sum 0: " + Arrays.toString(result));
    }

    public static int[] ZeroSumArray(int n) {
        if (n < 1 || n > 100) {
            System.out.println("Error: Value of n should be between 1 and 100");
            System.exit(1);
        }

        int[] result = new int[n];
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            int randomNum = RandomNonZeroNumber();
            result[i] = randomNum;
            sum += randomNum;
        }

        // ensures that the sum is 0
        result[n - 1] = -sum;

        return result;
    }

    private static int RandomNonZeroNumber() {
        // Generates a random integer between -100 and 100
        return (int) (Math.random() * 200) - 100;
    }
}
