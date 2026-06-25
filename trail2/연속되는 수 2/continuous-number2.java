import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = 1;
        int ans = 0;
        int prev = 0;

        while (n-- > 0) {
            int input = sc.nextInt();
            if (prev == 0 || prev != input) {
                ans = Math.max(ans, len);
                len = 1;
            } else {
                len++;
            }
            prev = input;
        }

        ans = Math.max(ans, len);

        System.out.println(ans);
    }
}