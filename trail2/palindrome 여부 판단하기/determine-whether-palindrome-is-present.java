import java.util.*;

public class Main {

    private static String isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i <= len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str));
    }
}