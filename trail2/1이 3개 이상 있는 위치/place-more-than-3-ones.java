import java.util.Scanner;
public class Main {

    private static final int[] DX = {-1, 1, 0, 0}; // 행
    private static final int[] DY = {0, 0, -1, 1}; // 열

    private static int n;

    private static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cnt = 0;
                for (int d = 0; d < 4; d++) {
                    int x = i + DX[d];
                    int y = j + DY[d];
                    if (inRange(x, y) && arr[x][y] == 1) {
                        cnt++;
                    }
                }
                if (cnt >= 3) {
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
}