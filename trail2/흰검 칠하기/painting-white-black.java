import java.io.*;
import java.util.*;

public class Main {
    private static final int OFFSET = 100_000;
    private static final int MAX_R = 200_000;

    private static int[] white = new int[MAX_R + 1];
    private static int[] black = new int[MAX_R + 1];
    private static int[] checked = new int[MAX_R + 1];

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
                for (int j = cur; j < cur + x; j++) {
                    if (checked[j] < 3) {
                        checked[j] = 2;
                        black[j]++;
                        if (white[j] >= 2 && black[j] >= 2) {
                            checked[j] = 3;
                        }
                    }
                }
                cur += x - 1;
            } else {
                for (int j = cur; j > cur - x; j--) {
                    if (checked[j] < 3) {
                        checked[j] = 1;
                        white[j]++;
                        if (white[j] >= 2 && black[j] >= 2) {
                            checked[j] = 3;
                        }
                    }
                }
                cur -= x - 1;
            }
        }

        int whiteCnt = 0;
        int blackCnt = 0;
        int grayCnt = 0;

        for (int i = 0; i <= MAX_R; i++) {
            if (checked[i] == 3) {
                grayCnt++;
            } else if (checked[i] == 2) {
                blackCnt++;
            } else if (checked[i] == 1) {
                whiteCnt++;
            }
        }

        System.out.println(whiteCnt + " " + blackCnt + " " + grayCnt);
    }
}