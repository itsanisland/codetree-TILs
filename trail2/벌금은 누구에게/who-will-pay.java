import java.io.*;
import java.util.*;

public class Main {

    private static final int MAX_N = 100;

    private static int[] penalties = new int[MAX_N + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int ans = -1;
        while (m-- > 0) {
            int num = Integer.parseInt(br.readLine());
            penalties[num]++;

            if (penalties[num] == k) {
                ans = num;
                break;
            } 
        }
     
        System.out.println(ans);
    }
}