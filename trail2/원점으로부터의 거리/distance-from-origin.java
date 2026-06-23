import java.util.*;

class Point {
    int number;
    int x;
    int y;

    Point(int number, int x, int y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] arr = new Point[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = new Point(i + 1, x, y);
        }
        
        Arrays.sort(arr, (a, b) -> {
            int distA = Math.abs(a.x) + Math.abs(a.y);
            int distB = Math.abs(b.x) + Math.abs(b.y);
            if (distA == distB) {
                return a.number - b.number;
            }
            return distA - distB;
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].number);
        }
    }
}