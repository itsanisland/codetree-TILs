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
        boolean isAFront = posA[1] >= posB[1]; // 초기 설정 (카운트 없이)

        for (int i = 2; i <= cur; i++) { // i=2부터 비교 시작
            if (isAFront && posA[i] < posB[i]) {
                isAFront = false;
                ans++;
            } else if (!isAFront && posA[i] > posB[i]) {
                isAFront = true;
                ans++;
            }
        }

        System.out.println(ans);
    }
}