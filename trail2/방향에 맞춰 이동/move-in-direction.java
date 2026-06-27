import java.io.*;
import java.util.*;

public class Main {

    private static final int[] DY = {0, -1, 1, 0};
    private static final int[] DX = {-1, 0, 0, 1};
    private static final String DIR = "WSNE";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int y = 0, x = 0;

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int dir = DIR.indexOf(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            
            y += DY[dir] * dist;
            x += DX[dir] * dist;
        }

        System.out.println(x + " " + y);
    }
}