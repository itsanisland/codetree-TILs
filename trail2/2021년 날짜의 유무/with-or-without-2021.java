import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(check(m, d));
    }

    private static String check(int m, int d) {
        if (m > 12 || d > 31 || (m == 2 && d > 28)) {
            return "No";
        }

        if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
            return "No";
        }

        return "Yes";
    }
}