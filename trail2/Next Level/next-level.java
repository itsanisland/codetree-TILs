import java.util.Scanner;

class Info {
    String id;
    int lv;

    Info() {
        this.id = "codetree";
        this.lv = 10;
    }

    Info(String id, int lv) {
        this.id = id;
        this.lv = lv;
    }

    void print() {
        System.out.println("user " + id + " lv " + lv);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int lv = sc.nextInt();
        
        Info info1 = new Info();
        Info info2 = new Info(id, lv);
        
        info1.print();
        info2.print();
    }
}