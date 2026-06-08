import java.io.*;
import java.util.*;

public class Main {
    private static final int[] NUM_OF_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] DAY_OF_WEEK = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        int diff = convertToDays(m2, d2) - convertToDays(m1, d1);
        diff %= 7;

        if (diff < 0) {
            // 음수인 경우, 양수로 넘겨 계산
            diff += 7;
        }

        System.out.println(DAY_OF_WEEK[diff]);
    }

    private static int convertToDays(int m, int d) {
        int total = 0;
        for (int i = 1; i < m; i++) {
            total += NUM_OF_DAYS[i];
        }
        total += d;
        return total;
    }
}