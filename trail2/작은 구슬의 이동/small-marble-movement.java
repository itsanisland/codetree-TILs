import java.io.*;
import java.util.*;

public class Main {

    private static final int ASCII_NUM = 128;
    private static final int DIR_NUM = 4;

    private static final int[] DX = {-1, 0, 0, 1};
    private static final int[] DY = {0, -1, 1, 0};

    private static int n, t;
    private static int x, y, dir;
    private static int[] mapper = new int[ASCII_NUM];

    private static boolean inRange(int x, int y) {
        return x >= 1 && x <= n && y >= 1 && y <= n;
    }

    private static void simulate() {
        while (t-- > 0) {
            if (inRange(x + DX[dir], y + DY[dir])) {
                x += DX[dir];
                y += DY[dir];
            } else {
                dir = 3 - dir;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        mapper['U'] = 0;
        mapper['L'] = 1;
        mapper['R'] = 2;
        mapper['D'] = 3;

        dir = mapper[st.nextToken().charAt(0)];

        simulate();

        System.out.println(x + " " + y);
    }
}