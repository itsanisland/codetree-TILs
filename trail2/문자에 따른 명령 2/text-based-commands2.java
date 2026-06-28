import java.util.Scanner;

public class Main {

    private static final int[] DY = {1, 0, -1, 0};
    private static final int[] DX = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int y = 0, x = 0;
        int dir = 0;

        for (char cmd : s.toCharArray()) {
            if (cmd == 'F') {
                y += DY[dir];
                x += DX[dir];
            } else if (cmd == 'L') {
                dir = (dir - 1 + 4) % 4;
            } else {
                dir = (dir + 1) % 4;
            }
        }

        System.out.println(x + " " + y);
    }
}