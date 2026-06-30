import java.io.*;
import java.util.*;

public class Main {

    private static final int MAX_N = 100;
    private static final int[] DX = {1, 0, -1, 0};
    private static final int[] DY = {0, -1, 0, 1};

    private static int n;
    private static boolean[][] colored = new boolean[MAX_N + 1][MAX_N + 1];
    
    private static boolean inRange(int x, int y) {
        return x >= 1 && x <= n && y >= 1 && y <= n;
    }

    private static boolean check(int x, int y) {
        int cnt = 0;
        for (int dir = 0; dir < 4; dir++) {
            int nx = x + DX[dir];
            int ny = y + DY[dir];

            if (inRange(nx, ny) && colored[nx][ny]) {
                cnt++;
            }
        }
        return cnt == 3;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int ans = 0;

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            colored[r][c] = true;
            System.out.println(check(r, c) ? 1 : 0);
        }
    }
}