import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 || contains369(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean contains369(int n) {
        // 1 0 3 4 5
        // <-------- 이 방향으로 조사
        while (n > 0) {
            // 일의 자리 조사
            if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
                return true;
            }
            // 계속 10으로 나눔
            n /= 10;
        }
        return false;
    }
}