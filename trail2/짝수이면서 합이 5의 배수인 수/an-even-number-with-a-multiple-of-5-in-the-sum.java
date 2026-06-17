import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }

    private static String solve(int n) {
        return n % 2 == 0 && (n / 10 + n % 10) % 5 == 0 ? "Yes" : "No";
    }
}