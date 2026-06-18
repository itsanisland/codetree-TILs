import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        int ans = 10001;
        switch(o) {
            case '+':
                ans = add(a, c);
                break;
            case '-':
                ans = subtract(a, c);
                break;
            case '*':
                ans = multiply(a, c);
                break;
            case '/':
                ans = divide(a, c);
                break;
        }

        System.out.println(ans == 10001 ? "False" : (a + " " + o + " " + c + " = " + ans));
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}