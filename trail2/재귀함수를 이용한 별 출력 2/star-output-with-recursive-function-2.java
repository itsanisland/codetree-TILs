import java.util.*;

public class Main {

    private static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
    }

    private static void print(int n) {
        if (n == 0) {
            return;
        }

        printStar(n);
        print(n - 1);
        printStar(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}