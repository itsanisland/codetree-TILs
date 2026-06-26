import java.io.*;
import java.util.*;

class HandShake {
    int x, y;

    HandShake(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    private static final int MAX_N = 100;
    private static final int MAX_T = 250;

    private static int[] count = new int[MAX_N + 1];
    private static boolean[] checked = new boolean[MAX_N + 1];
    private static HandShake[] handShakes = new HandShake[MAX_T + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        checked[P] = true;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            handShakes[t] = new HandShake(x, y);
        }
        
        for (int i = 1; i <= MAX_T; i++) {
            if (handShakes[i] == null) {
                continue;
            }

            int x = handShakes[i].x;
            int y = handShakes[i].y;

            if (checked[x]) {
                count[x]++;
            }

            if (checked[y]) {
                count[y]++;
            }

            if (count[x] <= K && checked[x]) {
                checked[y] = true;
            }

            if (count[y] <= K && checked[y]) {
                checked[x] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(checked[i] ? 1 : 0);
        }

        System.out.println(sb);
    }
}