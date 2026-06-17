import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 || checkNum(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean checkNum(int n) {
        String str = "" + n;
        return str.contains("3") || str.contains("6") || str.contains("9");
    }
}