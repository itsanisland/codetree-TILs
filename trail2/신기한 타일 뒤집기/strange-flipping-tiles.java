import java.io.*;
import java.util.*;

public class Main {
    private static final int OFFSET = 100_000;
    private static final int MAX_R = 200_000;

    private static int[] color = new int[MAX_R + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int cur = OFFSET;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char cmd = st.nextToken().charAt(0);
            
            if (cmd == 'R') {
                // x칸 오른쪽으로 칠하기
                while (x-- > 0) {
                    color[cur] = 2;
                    cur++;
                }
                cur--; // 현재 위치 포함 x칸
            } else {
                // x칸 왼쪽으로 칠하기
                while (x-- > 0) {
                    color[cur] = 1;
                    cur--;
                }
                cur++; // 현재 위치 포함 x칸
            }
        }

        int whiteCnt = 0;
        int blackCnt = 0;

        for (int i = 0; i <= MAX_R; i++) {
            if (color[i] == 2) {
                blackCnt++;
            } else if (color[i] == 1) {
                whiteCnt++;
            }
        }

        System.out.println(whiteCnt + " " + blackCnt);
    }
}