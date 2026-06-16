import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(add(n));
    }

    private static int add(int n) {
        return (1 + n) * n / 2 / 10;
    }
}