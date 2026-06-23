import java.util.*;

class Student {
    int idx;
    int height;
    int weight;

    Student(int idx, int height, int weight) {
        this.idx = idx;
        this.height = height;
        this.weight = weight;
    }

    public void print() {
        System.out.println(height + " " + weight + " " + idx);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr[i] = new Student(i + 1, height, weight);
        }
        
        Arrays.sort(arr, (a, b) -> {
            if (a.height == b.height) {
                return b.weight - a.weight;
            }
            return a.height - b.height;
        });

        for (int i = 0; i < n; i++) {
            arr[i].print();
        }
    }
}