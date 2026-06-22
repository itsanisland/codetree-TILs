import java.util.*;

class Product {
    String name;
    int code;

    Product() {
        this.name = "";
        this.code = 0;
    }

    Product(String name, int code) {
        this.name = name;
        this.code = code;
    }

    void print() {
        System.out.println("product " + code + " is " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int code = sc.nextInt();

        Product p1 = new Product();
        p1.name = "codetree";
        p1.code = 50;

        Product p2 = new Product(name, code);

        p1.print();
        p2.print();
    }
}