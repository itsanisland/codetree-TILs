import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int decimal = 0;

        for (int i = 0; i < n.length(); i++) {
            decimal *= 2;
            decimal += n.charAt(i) - '0';
        }

        decimal *= 17;

        StringBuilder sb = new StringBuilder();
        
        while (decimal > 0) {
            sb.append(decimal % 2);
            decimal /= 2;
        }

        System.out.println(sb.reverse());
    }
}