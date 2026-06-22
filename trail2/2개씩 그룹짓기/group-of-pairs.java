import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n * 2];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n * 2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, arr[i] + arr[2 * n - 1 - i]);
        }

        System.out.println(ans);
    }
}