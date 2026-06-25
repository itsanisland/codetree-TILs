import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX_N = 10;
    private static final int MAX_R = 200;
    private static final int OFFSET = 100;

    private static int n;

    private static boolean[][] rectangles = new boolean[MAX_R + 1][2 * MAX_R + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) + OFFSET;
            int y = Integer.parseInt(st.nextToken()) + OFFSET;

            for (int i = y; i < y + 8; i++) {
                for (int j = x; j < x + 8; j++) {
                    rectangles[i][j] = true;
                }
            }
        }

        int area = 0;
        for (int i = 0; i <= 2 * OFFSET; i++) {
            for (int j = 0; j <= 2 * OFFSET; j++) {
                if (rectangles[i][j]) {
                    area++;
                }
            }
        }

        System.out.println(area);
    }
}