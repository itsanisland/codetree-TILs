import java.util.*;

public class Main {
    
    private static int solve(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return solve(n - 1) + solve(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}