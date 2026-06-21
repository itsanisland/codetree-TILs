import java.util.*;

public class Main {
    
    private static int solve(int n, int end) {
        if (n == end) {
            if ((end == 1 && n % 2 != 0) || (end == 2 && n % 2 == 0)) {
                return n;
            }
        }

        if ((end == 1 && n % 2 != 0) || (end == 2 && n % 2 == 0)) {
            return solve(n - 1, end) + n;
        } else {
            return solve(n - 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n, n % 2 == 0 ? 2 : 1));
    }
}