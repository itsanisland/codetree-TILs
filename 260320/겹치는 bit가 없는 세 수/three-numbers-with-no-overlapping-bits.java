import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        long ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    long a = arr[i], b = arr[j], c = arr[k];

                    if ((a & b) == 0 && (a & c) == 0 && (b & c) == 0) {
                        ans = Math.max(ans, a + b + c);
                    }
                }
            }
        }

        System.out.println(ans);
    }
}