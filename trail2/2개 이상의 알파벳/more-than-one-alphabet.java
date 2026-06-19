import java.util.*;
public class Main {

    private static String solve(String str) {
        Set<Character> set = new HashSet<>();
        
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        if (set.size() >= 2) {
            return "Yes";
        }

        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(solve(A));
    }
}