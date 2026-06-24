import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int decimal = 0;
        
        for (int i = 0; i < s.length(); i++) {
            decimal *= 2;
            decimal += Integer.parseInt("" + s.charAt(i));
        }

        System.out.println(decimal);
    }
}