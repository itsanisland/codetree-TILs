import java.util.*;

class Person {
    String name;
    int height;
    float weight;

    Person(String name, int height, float weight) {
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
        Person[] arr = new Person[5];

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            float weight = sc.nextFloat();
            arr[i] = new Person(name, height, weight);
        }
        
        Arrays.sort(arr, (a, b) -> a.name.compareTo(b.name));

        System.out.println("name");
        for (int i = 0; i < 5; i++) {
            arr[i].print();
        }

        Arrays.sort(arr, (a, b) -> b.height - a.height);

        System.out.println("\nheight");
        for (int i = 0; i < 5; i++) {
            arr[i].print();
        }
    }
}