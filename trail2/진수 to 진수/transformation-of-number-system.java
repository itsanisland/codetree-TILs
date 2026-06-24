import java.util.*;

public class Main {

    private static int convertToDecimal(String n, int a) {
        int decimal = 0;
        for (int i = 0; i < n.length(); i++) {
            decimal *= a;
            decimal += n.charAt(i) - '0';
        }
        return decimal;
    }

    private static String convertFromDecimal(int decimal, int b) {
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(decimal % b);
            decimal /= b;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        System.out.println(convertFromDecimal(convertToDecimal(n, a), b));
    }
}