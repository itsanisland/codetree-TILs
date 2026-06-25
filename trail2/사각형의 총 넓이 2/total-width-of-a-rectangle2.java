import java.io.*;
import java.util.*;

public class Main {
    private static final int OFFSET = 100;
    private static boolean[][] rectangles = new boolean[2 * OFFSET + 1][2 * OFFSET + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) + 100;
            int y1 = Integer.parseInt(st.nextToken()) + 100;
            int x2 = Integer.parseInt(st.nextToken()) + 100;
            int y2 = Integer.parseInt(st.nextToken()) + 100;

            for (int i = y1; i < y2; i++) {
                for (int j = x1; j < x2; j++) {
                    rectangles[i][j] = true;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i <= 2 * OFFSET; i++) {
            for (int j = 0; j <= 2 * OFFSET; j++) {
                if (rectangles[i][j]) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}