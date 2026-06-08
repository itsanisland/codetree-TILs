import java.io.*;
import java.util.*;

public class Main {
    private static final int[] NUM_OF_DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String[] DAY_OF_WEEK = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    private static final Map<String, Integer> map = new HashMap<String, Integer>() {{
        put("Mon", 0);
        put("Tue", 1);
        put("Wed", 2);
        put("Thu", 3);
        put("Fri", 4);
        put("Sat", 5);
        put("Sun", 6);
    }};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        int dayOfWeek = map.get(br.readLine());
        int count = 0;

        int diff = convertToDays(m2, d2) - convertToDays(m1, d1);
        
        count += diff / 7;
        diff %= 7;

        if (diff >= dayOfWeek) {
            count++;
        }

        System.out.println(count);
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