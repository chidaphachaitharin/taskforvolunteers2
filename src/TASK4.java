import java.util.Arrays;
import java.util.Scanner;

public class TASK4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n between 1 and 10000 : ");
        int n = sc.nextInt();

        if (n < 1 || n > 10000) {
            System.out.println("Error: Value of n should be between 1 and 10000");
            System.exit(1);
        }

        System.out.println("Largest sibling of " + n + ": " + findLargestSibling(n));
    }

        public static int findLargestSibling(int n) {

            char[] digits = String.valueOf(n).toCharArray();

            Arrays.sort(digits);
            StringBuilder largestSibling = new StringBuilder(new String(digits));
            largestSibling.reverse();

            return Integer.parseInt(largestSibling.toString());
        }

}
