import java.util.*;

public class Main {

    private static int solve(String n, String m) {
        if (n.contains(m)) {
            return n.indexOf(m);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();
        System.out.println(solve(n, m));
    }
}