import java.io.*;
import java.util.*;

public class Main {
    private static final int OFFSET = 100;
    private static final int MAX_R = 200;
    private static final int MAX_N = 100;

    private static int n;
    private static int[] x1 = new int[MAX_N]; // 시작 지점
    private static int[] x2 = new int[MAX_N]; // 끝 지점

    private static int[] checked = new int[MAX_R + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int cur = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char cmd = st.nextToken().charAt(0);
            
            if (cmd == 'R') {
                x1[i] = cur;
                x2[i] = cur + x;
                cur += x;
            } else {
                // 왼쪽으로 이동할 경우: (cur - x) ~ cur 까지 경로 이돈
                x1[i] = cur - x;
                x2[i] = cur;
                cur -= x;
            }

            x1[i] += OFFSET;
            x2[i] += OFFSET;
        }

        // 구간 칠하기
        for (int i = 0; i < n; i++) {
            for (int j = x1[i]; j < x2[i]; j++) {
                checked[j]++;
            }
        }

        int ans = 0;
        for (int i = 0; i <= MAX_R; i++) {
            if (checked[i] >= 2) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}