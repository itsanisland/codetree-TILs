import java.io.*;
import java.util.*;

public class Main {

    private static final int MAX_N = 1000;
    private static final int[] DX = {1, 0, -1, 0}; // 하 좌 상 우
    private static final int[] DY = {0, -1, 0, 1};

    private static int n, k, x, y, dir;
    private static char[][] map = new char[MAX_N][MAX_N];
    
    private static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    private static void initialize() {
        if (k <= n) {
            x = 0;
            y = k - 1;
            dir = 0;
        } else if (k <= 2 * n) {
            x = k - n - 1;
            y = n - 1;
            dir = 1;
        } else if (k <= 3 * n) {
            x = n - 1;
            y = n - (k - 2 * n);
            dir = 2;
        } else {
            x = n - (k - 3 * n);
            y = 0;
            dir = 3;
        }
    }

    private static void move(int nextDir) {
        x += DX[nextDir];
        y += DY[nextDir];
        dir = nextDir;
    }

    private static int simulate() {
        int moveNum = 0;
        while (inRange(x, y)) {
            if (map[x][y] == '/') {
                move(dir ^ 1);
            } else {
                move(3 - dir);
            }
            moveNum++;
        }
        return moveNum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }

        k = Integer.parseInt(br.readLine());

        // k를 통해 초기 위치, 방향 확인
        initialize();

        // 거울 빛 튕기기
        int ans = simulate();
        System.out.println(ans);
    }
}