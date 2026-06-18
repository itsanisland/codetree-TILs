import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(check(y, m, d));
    }

    private static String check(int y, int m, int d) {
        if (m <= 12 && d <= getLastDay(y, m)) {
            if (m >= 3 && m <= 5) {
                return "Spring";
            }

            if (m >= 6 && m <= 8) {
                return "Summer";
            }

            if (m >= 9 && m <= 11) {
                return "Fall";
            }

            if ((m >= 11 && m <= 12) || m >= 1 && m <= 2) {
                return "Winter";
            }
        }
        return "-1";
    }

    private static int getLastDay(int y, int m) {
        if (m == 2) {
            if (y % 4 == 0) {
                if (y % 100 == 0) {
                    if (y % 400 == 0) {
                        return 29;
                    }
                    return 28;
                }
                return 29;
            }
            return 28;
        }

        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }

        return 31;
    }
}