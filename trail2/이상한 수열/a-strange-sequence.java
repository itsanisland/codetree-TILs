import java.util.Scanner;
public class Main {

    private static int solve(int n) {
        if (n <= 2) {
            return n;
        }
        return solve(n / 3) + solve(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}