import java.io.*;
import java.util.*;

public class Main {
    private static final int[] NUM_OF_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        int sum = 0;
        int mDiff = m2 - m1;

        if (mDiff > 0) {
            sum += NUM_OF_DAYS[m1] - d1 + 1;
            while (++m1 < m2) {
                sum += NUM_OF_DAYS[m1];
            }
            sum += d2;
        } else {
            sum = d2 - d1 + 1;
        }

        System.out.println(sum);
    }
}