import java.io.*;
import java.util.*;

public class Main {

    private static final int MAX_T = 2_000_000;

    private static int[] posA = new int[MAX_T + 1];
    private static int[] posB = new int[MAX_T + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int curA = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            if (d == 'L') {
                while (t-- > 0) {
                    posA[curA + 1] = posA[curA] - 1;
                    curA++;
                }
            } else {
                while (t-- > 0) {
                    posA[curA + 1] = posA[curA] + 1;
                    curA++;
                }
            }
        }

        int curB = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            if (d == 'L') {
                while (t-- > 0) {
                    posB[curB + 1] = posB[curB] - 1;
                    curB++;
                }
            } else {
                while (t-- > 0) {
                    posB[curB + 1] = posB[curB] + 1;
                    curB++;
                }
            }
        }

        int ans = 0;

        for (int i = 1; i <= Math.max(curA, curB); i++) {
            posA[i] = i > curA ? posA[curA] : posA[i];
            posB[i] = i > curB ? posB[curB] : posB[i];
            if (posA[i] == posB[i] && posA[i - 1] != posB[i - 1]) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}