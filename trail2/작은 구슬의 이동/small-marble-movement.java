import java.io.*;
import java.util.*;

public class Main {

    private static final int[] DX = {-1, 0, 0, 1};
    private static final int[] DY = {0, -1, 1, 0};

    private static int n;

    private static int getDir(char d) {
        switch (d) {
            case 'U':
                return 0;
            case 'D':
                return 3;
            case 'R':
                return 2;
            case 'L':
                return 1;
        }
        return -1;
    }

    private static boolean inRange(int x, int y) {
        return x >= 1 && x <= n && y >= 1 && y <= n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        char d = st.nextToken().charAt(0);

        int dir = getDir(d);

        while (t-- > 0) {
            if (inRange(r + DX[dir], c + DY[dir])) {
                r += DX[dir];
                c += DY[dir];
            } else {
                dir = 3 - dir;
            }
        }

        System.out.println(r + " " + c);
    }
}