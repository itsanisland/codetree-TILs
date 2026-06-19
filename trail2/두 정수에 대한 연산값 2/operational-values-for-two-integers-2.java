import java.util.*;

class IntWrapper {
    int value;
    IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    private static void solve(IntWrapper a, IntWrapper b) {
        if (a.value < b.value) {
            a.value += 10;
            b.value *= 2;
        } else {
            b.value += 10;
            a.value *= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());

        solve(a, b);

        System.out.println(a.value + " " + b.value);
    }
}