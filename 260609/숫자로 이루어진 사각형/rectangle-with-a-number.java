import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRect(n);
    }

    private static void printRect(int n) {
        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num = (num % 9) + 1;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}