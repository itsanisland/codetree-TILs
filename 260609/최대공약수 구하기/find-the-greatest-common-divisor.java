import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // n m
        // 12 18
        // 18 12
        // 12  6
        // 6  6
        // 6 0
        System.out.println(getGCD(n, m));
    }

    private static int getGCD(int n, int m) {
        if (m == 0) {
            return n;
        }
        return getGCD(m, n % m); // 무조건 n > m 형태
    }
}