import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX_N = 10;
    private static final int MAX_R = 2000;
    private static final int OFFSET = 1000;

    private static boolean[][] rectangles = new boolean[MAX_R + 1][2 * MAX_R + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
        int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
        int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
        int y2 = Integer.parseInt(st.nextToken()) + OFFSET;

        for (int i = y1; i < y2; i++) {
            for (int j = x1; j < x2; j++) {
                rectangles[i][j] = true;
            }
        }

        st = new StringTokenizer(br.readLine());
        x1 = Integer.parseInt(st.nextToken()) + OFFSET;
        y1 = Integer.parseInt(st.nextToken()) + OFFSET;
        x2 = Integer.parseInt(st.nextToken()) + OFFSET;
        y2 = Integer.parseInt(st.nextToken()) + OFFSET;

        for (int i = y1; i < y2; i++) {
            for (int j = x1; j < x2; j++) {
                rectangles[i][j] = false;
            }
        }

        int minX = MAX_R, maxX = 0;
        int minY = MAX_R, maxY = 0;
        int area = 0;
        for (int i = 0; i <= 2 * OFFSET; i++) {
            for (int j = 0; j <= 2 * OFFSET; j++) {
                if (rectangles[i][j]) {
                    minX = Math.min(minX, j);
                    minY = Math.min(minY, i);
                    maxX = Math.max(maxX, j);
                    maxY = Math.max(maxY, i);
                    area++;
                }
            }
        }

        System.out.println(area > 0 ? (maxX - minX + 1) * (maxY - minY + 1) : 0);
    }
}