import java.util.*;

public class Main {
    
    private static int solve(int n) {
        if (n <= 2) {
            return n;
        }

        // n과 홀짝이 같은 수만을 재귀함수로 호출
        return solve(n - 2) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}