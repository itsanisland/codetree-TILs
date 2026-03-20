import java.util.*;

public class Main {

    static class Student {
        int h, w, num;

        Student(int h, int w, int num) {
            this.h = h;
            this.w = w;
            this.num = num;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr[i] = new Student(h, w, i + 1);
        }

        Arrays.sort(arr, (a, b) -> {
            if (a.h != b.h) return b.h - a.h;
            else if (a.w != b.w) return b.w - a.w;
            else return a.num - b.num; 
        });

        for (Student s : arr) {
            System.out.println(s.h + " " + s.w + " " + s.num);
        }
    }
}