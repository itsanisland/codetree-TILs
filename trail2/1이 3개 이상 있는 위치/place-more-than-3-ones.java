import java.util.Scanner;
public class Main {

    private static final int MAX_N = 100;
    private static final int[] DX = {-1, 1, 0, 0}; // 행
    private static final int[] DY = {0, 0, -1, 1}; // 열

    private static int n;
    private static int[][] arr = new int[MAX_N][MAX_N];

    private static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    private static int adjacentCnt(int x, int y) {
        int cnt = 0;
        for (int d = 0; d < 4; d++) {
            int nx = x + DX[d];
            int ny = y + DY[d];
            if (inRange(nx, ny) && arr[nx][ny] == 1) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (adjacentCnt(i, j) >= 3) {
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
}