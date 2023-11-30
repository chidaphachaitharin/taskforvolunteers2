import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int x = sc.nextInt();

        System.out.print("The result is: " );
        for (int i=0;i<x;i++){
            if (i % 2 == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
    }
}