import java.io.*;
import java.util.*;

public class Main {

    private static final int MAX_T = 1_000_000;

    private static int[] posA = new int[MAX_T + 1];
    private static int[] posB = new int[MAX_T + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int cur = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            while (t-- > 0) {
                posA[cur + 1] = posA[cur] + v;
                cur++;
            }
        }

        cur = 0;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            while (t-- > 0) {
                posB[cur + 1] = posB[cur] + v;
                cur++;
            }
        }

        int ans = 0;
        int leader = 0;

        for (int i = 1; i <= cur; i++) {
            if (posA[i] < posB[i]) {
                if (leader != 2) {
                    ans++;
                }
                leader = 2;
            } else if (posA[i] > posB[i]) {
                if (leader != 1) {
                    ans++;
                }
                leader = 1;
            } else {
                if (leader != 0) {
                    ans++;
                }
                leader = 0;
            }
        }

        System.out.println(ans);
    }
}