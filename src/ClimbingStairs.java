import java.util.Scanner;

public class ClimbingStairs {

    public static long steps(long n) {
        if (n == 1 || n == 2) // If number of steps is 1 or 2 it return 1 or 2
            return n;
        else if (n == 3) // If number of steps is 3 it returns 4
            return 4;
        else
            return steps(n - 1) + steps(n - 2) + steps(n - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner class
        System.out.println("Enter the total number of steps");
        long n = sc.nextLong(); // stores the entered number in n as long.
        System.out.println("The number of distinct ways the stairs can be climbed are:" + steps(n));

    }
}
