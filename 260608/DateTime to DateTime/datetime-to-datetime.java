import java.io.*;
import java.util.*;

public class Main {
    private static final int[] NUM_OF_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int mins = convertToMins(A, B, C) - convertToMins(11, 11, 11);
        System.out.println(mins >= 0 ? mins : -1);
    }

    private static int convertToMins(int d, int h, int m) {
        return d * 24 * 60 + h * 60 + m;
    }
}