import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            list.add(Integer.parseInt(st.nextToken()));

            if (i % 2 == 0) continue;
            Collections.sort(list);

            System.out.print(list.get(i / 2) + " ");
        }
    }
}