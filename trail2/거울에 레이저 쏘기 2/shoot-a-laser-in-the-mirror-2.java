import java.io.*;
import java.util.*;

public class Main {

    private static final int MAX_N = 1000;
    private static final int[] DX = {1, 0, -1, 0}; // 하 좌 상 우
    private static final int[] DY = {0, -1, 0, 1};

    private static int n, k;
    private static char[][] map = new char[MAX_N][MAX_N];
    
    private static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }

        k = Integer.parseInt(br.readLine());

        // k를 통해 초기 위치, 방향 확인
        int x = 0, y = 0;

        int tempDir = 3;
        for (int i = 1; i < k; i++) {
            int nx = x + DX[tempDir];
            int ny = y + DY[tempDir];

            if (inRange(nx, ny)) {
                x = nx;
                y = ny;
            } else {
                tempDir = (tempDir + 1) % 4;
            }
        }

        int dir = (k - 1) / n;

        // 거울 빛 튕기기
        int ans = 0;
        while (inRange(x, y)) {
            ans++;
            if (map[x][y] == '\\') {
                if (dir == 0) {
                    dir = 3;
                } else if (dir == 1) {
                    dir = 2;
                } else if (dir == 2) {
                    dir = 1;
                } else {
                    dir = 0;
                }
            } else {
                if (dir == 0) {
                    dir = 1;
                } else if (dir == 1) {
                    dir = 0;
                } else if (dir == 2) {
                    dir = 3;
                } else {
                    dir = 2;
                }
            }
            x += DX[dir];
            y += DY[dir];
        }

        System.out.println(ans);
    }
}