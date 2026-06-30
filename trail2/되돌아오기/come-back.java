import java.io.*;
import java.util.*;

public class Main {

    private static final int ASCII_NUM = 128;
    private static final int DIR_NUM = 4;

    private static final int[] DX = {0, -1, 1, 0};
    private static final int[] DY = {-1, 0, 0, 1};

    private static int n;
    private static int[] mapper = new int[ASCII_NUM];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        mapper['W'] = 0;
        mapper['S'] = 1;
        mapper['N'] = 2;
        mapper['E'] = 3;

        int time = 0, ans = 0;
        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int dir = mapper[st.nextToken().charAt(0)];
            int t = Integer.parseInt(st.nextToken());

            while (t-- > 0) {
                x += DX[dir];
                y += DY[dir];
                time++;
                if (x == 0 && y == 0) {
                    ans = time;
                    break;
                }
            }

            if (ans > 0) {
                break;
            }
        }

        System.out.println(ans == 0 ? -1 : ans);
    }
}