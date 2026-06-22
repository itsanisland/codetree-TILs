import java.util.*;

class Person {
    String name, address, city;

    Person() {
        this.name = "";
        this.address = "";
        this.city = "";
    }

    Person(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    void print() {
        System.out.println("name " + name);
        System.out.println("addr " + address);
        System.out.println("city " + city);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] arr = new Person[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();
            arr[i] = new Person(name, address, region);
        }

        Arrays.sort(arr, (a, b) -> {
            return b.name.compareTo(a.name);
        });

        arr[0].print();
    }
}