import java.util.Scanner;
public class Main {
    private static int getMax(int n, int i, int max, int[] arr) {
        if (i == n) {
            return max;
        }
        
        if (arr[i] > max) {
            return getMax(n, i + 1, arr[i], arr);
        } else {
            return getMax(n, i + 1, max, arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(getMax(n, 0, 0, arr));
    }
}