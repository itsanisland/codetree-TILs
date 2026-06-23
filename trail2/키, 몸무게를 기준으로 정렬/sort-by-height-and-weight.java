import java.util.*;

class Person {
    String name;
    int height;
    int weight;

    Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void print() {
        System.out.println(name + " " + height + " " + weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] arr = new Person[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr[i] = new Person(name, height, weight);
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