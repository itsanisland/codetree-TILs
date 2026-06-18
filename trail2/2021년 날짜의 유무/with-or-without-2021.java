import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(check(m, d));
    }

    private static String check(int m, int d) {
        if (m <= 12 && d <= getLastDay(m)) {
            return "Yes";
        }
        return "No";
    }

    private static int getLastDay(int m) {
        if (m == 2) {
            return 28;
        }

        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }

        return 31;
    }
}