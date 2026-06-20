import java.util.*;

public class Main {

    private static void print(int n) {
        if (n == 0) {
            return;
        }

        print(n - 1);
        System.out.print(n + " ");
    }

    private static void printReverse(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printReverse(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        System.out.println();
        printReverse(n);
    }
}