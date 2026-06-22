import java.util.*;

class Bomb {
    String code;
    char color;
    int second;

    Bomb() {
        this.code = "";
        this.color = ' ';
        this.second = 0;
    }

    Bomb(String code, char color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }

    void print() {
        System.out.println("code : " + code);
        System.out.println("color : " + color);
        System.out.println("second : " + second);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        char color = sc.next().charAt(0);
        int second = sc.nextInt();

        Bomb bomb = new Bomb(code, color, second);

        bomb.print();
    }
}