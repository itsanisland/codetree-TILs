import java.util.*;

public class Main {

    private static final int MAX_T = 1_000_000;

    private static int[] posA = new int[MAX_T + 1];
    private static int[] posB = new int[MAX_T + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int cur = 0;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            while (t-- > 0) {
                posA[cur + 1] = posA[cur] + v;
                cur++;
            }
        }

        cur = 0;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            while (t-- > 0) {
                posB[cur + 1] = posB[cur] + v;
                cur++;
            }
        }

        int ans = 0;
        int leader = 0;

        for (int i = 1; i <= cur; i++) {
            if (posA[i] < posB[i]) {
                if (leader == 1) {
                    ans++;
                }
                leader = 2;
            } else if (posA[i] > posB[i]) {
                if (leader == 2) {
                    ans++;
                }
                leader = 1;
            }
        }

        System.out.println(ans);
    }
}