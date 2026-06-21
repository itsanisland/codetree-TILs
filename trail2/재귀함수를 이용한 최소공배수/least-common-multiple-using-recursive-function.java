import java.util.Scanner;

public class Main {

    private final static int MAX_N = 10;
    private static int[] arr = new int[MAX_N];
    
    private static int getGCD(int a, int b) {
        return b > 0 ? getGCD(b, a % b) : a;
    }

    private static int getLCM(int a, int b) {
        return a * b / getGCD(a, b);
    }

    private static int solve(int n) {
        if (n == 0) {
            return arr[0];
        }
        return getLCM(solve(n - 1), arr[n]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(solve(n - 1));
    }
}