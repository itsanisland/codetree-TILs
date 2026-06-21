import java.util.*;

public class Main {
    
    private static int solve(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return solve(n / 2) + 1;
        } else {
            return solve(n / 3) + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}