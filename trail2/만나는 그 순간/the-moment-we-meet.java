import java.io.*;
import java.util.*;

public class Main {

    private static final int MAX_N = 1000;
    private static final int MAX_M = 1000;
    private static final int MAX_T = 1000;

    private static int[] posA = new int[MAX_N * MAX_T + 1];
    private static int[] posB = new int[MAX_M * MAX_T + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Arrays.fill(posA, MAX_N * MAX_T + 1);
        Arrays.fill(posB, MAX_N * MAX_T + 1);
        
        int cur = 0;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            char d = st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());

            if (d == 'L') {
                for (int i = cur + 1; i <= cur + t; i++) {
                    posA[i] = posA[i - 1] - 1;
                }
            } else {
                for (int i = cur + 1; i <= cur + t; i++) {
                    posA[i] = posA[i - 1] + 1;
                }
            }
            cur += t;
        }

        cur = 0;
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            char d = st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());

            if (d == 'L') {
                for (int i = cur + 1; i <= cur + t; i++) {
                    posB[i] = posB[i - 1] - 1;
                }
            } else {
                for (int i = cur + 1; i <= cur + t; i++) {
                    posB[i] = posB[i - 1] + 1;
                }
            }
            cur += t;
        }

        int ans = -1;
        for (int i = 1; i <= MAX_N * MAX_T; i++) {
            if (posA[i] == MAX_N * MAX_T + 1 && posB[i] == MAX_N * MAX_T + 1) {
                continue;
            }

            if (posA[i] == posB[i]) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}