import java.util.Scanner;
public class Main {

    private static final int MAX_N = 100;
    private static final int MAX_M = 100;

    private static final int[] DX = {0, 1, 0, -1};
    private static final int[] DY = {1, 0, -1, 0};

    private static int n, m;

    private static int[][] arr = new int[MAX_N][MAX_M];

    private static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int x = 0, y = 0;
        int dir = 0;

        arr[x][y] = 1;

        for (int i = 2; i <= n * m; i++) {
            int nx = x + DX[dir];
            int ny = y + DY[dir];

            if (!inRange(nx, ny) || arr[nx][ny] != 0) {
                dir = (dir + 1) % 4;
            }

            x += DX[dir];
            y += DY[dir];
            arr[x][y] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}