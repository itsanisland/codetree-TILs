import java.util.*;

public class Main {

    private static int solve(int[] arr, int m) {
        int sum = arr[m];
        while (m != 1) {
            if (m % 2 != 0) {
                m -= 1;
            } else {
                m /= 2;
            }
            sum += arr[m];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        System.out.println(solve(arr, m));
    }
}