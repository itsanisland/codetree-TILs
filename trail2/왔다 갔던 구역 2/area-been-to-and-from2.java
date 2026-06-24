import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[201];
        int cur = 100;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char cmd = st.nextToken().charAt(0);
            if (cmd == 'R') {
                for (int j = 0; j < x; j++) {
                    arr[cur + j]++;
                }
                cur += x;
            } else {
                for (int j = 1; j <= x; j++) {
                    arr[cur - j]++;
                }
                cur -= x;
            }
        }

        int ans = 0;
        for (int i = 0; i <= 200; i++) {
            if (arr[i] >= 2) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}