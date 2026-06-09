import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getLCM(n, m));
    }

    private static int getLCM(int n, int m) {
        // 12 18
        // 24 36
        // 36 36 
        int i = 1, j = 1;

        while (n * i != m * j) {
            if (n * i < m * j) {
                i++;
            } else if (n * i > m * j) {
                j++;
            }
        }
        
        return n * i;
    }
}