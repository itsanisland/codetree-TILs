import java.util.*;

public class Main {

    private static String convertToBin(int decimal) {
        int[] digits = new int[100_000];
        int cnt = 0;
        StringBuilder sb = new StringBuilder();

        while (true) {
            digits[cnt++] = decimal % 2;
            decimal /= 2;
            if (decimal == 0) {
                break;
            }
        }

        for (int i = cnt - 1; i >= 0; i--) {
            sb.append(digits[i]);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(convertToBin(n));
    }
}