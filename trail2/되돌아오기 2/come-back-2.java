import java.io.*;
import java.util.*;

public class Main {

    private static final int[] DX = {1, 0, -1, 0};
    private static final int[] DY = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int x = 0, y = 0;
        int dir = 0;
        int ans = -1, elapsedTime = 0;

        for (char cmd : s.toCharArray()) {
            if (cmd == 'L') {
                dir = (dir + 1) % 4;
            } else if (cmd == 'R') {
                dir = (dir + 3) % 4;
            } else {
                x += DX[dir];
                y += DY[dir];
            }

            elapsedTime++;

            if (x == 0 && y == 0) {
                ans = elapsedTime;
                break;
            }
        }

        System.out.println(ans);
    }
}