import java.util.*;

class Number {
    int idx, num, rank;

    Number(int idx, int num) {
        this.idx = idx;
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number[] arr = new Number[n];
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            arr[i] = new Number(i, num);
        }
        
        Arrays.sort(arr, (a, b) -> a.num - b.num);

        for (int i = 0; i < n; i++) {
            arr[i].rank = i + 1;
        }

        Arrays.sort(arr, (a, b) -> a.idx - b.idx);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i].rank + " ");
        }
    }
}