import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int len = 0, ans = 0, prev = 0;

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input <= t) {
                len = 0;
            } else {
                len++;
            }
            prev = input;
            ans = Math.max(ans, len);
        }

        System.out.println(ans);
    }
}