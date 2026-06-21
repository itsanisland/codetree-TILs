import java.util.*;

public class Main {
    
    private static int solve(int n) {
        if (n < 10) {
            return n * n;
        }
        return solve(n / 10) + (n % 10) * (n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}