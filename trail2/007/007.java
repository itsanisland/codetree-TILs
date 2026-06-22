import java.util.Scanner;

class Info {
    String sCode;
    char mPoint;
    int time;

    Info(String sCode, char mPoint, int time) {
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }

    void print() {
        System.out.println("secret code : " + sCode);
        System.out.println("meeting point : " + mPoint);
        System.out.println("time : " + time);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        Info info = new Info(sCode, mPoint, time);
        info.print();
    }
}