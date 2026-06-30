import java.io.*;
import java.util.*;

public class Main {

    private static final int ASCII_NUM = 128;
    private static final int DIR_NUM = 4;

    private static final int[] DX = {0, -1, 1, 0};
    private static final int[] DY = {-1, 0, 0, 1};

    private static int n, x, y;
    private static int ans = -1;
    private static int elapsedTime;
    private static int[] mapper = new int[ASCII_NUM];

    private static boolean move(int dir, int dist) {
        while (dist-- > 0) {
            x += DX[dir];
            y += DY[dir];
            elapsedTime++;

            if (x == 0 && y == 0) {
                ans = elapsedTime;
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        mapper['W'] = 0;
        mapper['S'] = 1;
        mapper['N'] = 2;
        mapper['E'] = 3;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int dir = mapper[st.nextToken().charAt(0)];
            int dist = Integer.parseInt(st.nextToken());

            boolean done = move(dir, dist);
        
            if (done) {
                break;
            }
        }

        System.out.println(ans);
    }
}