import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int q = sc.nextInt();
        int s = 0;

        while (q-- > 0) {
            String cmd = sc.next();
            int x = cmd.equals("clear") ? -1 : sc.nextInt();

            switch (cmd) {
                case "add": // +
                    if (((s >> x) & 1) == 0) s += (1 << x);
                    break;
                case "delete": // -
                    if (((s >> x) & 1) == 1) s -= (1 << x);
                    break;
                case "print": // AND
                    sb.append((s >> x) & 1).append("\n");
                    break;
                case "toggle": // XOR
                    s ^= (1 << x);
                    break;
                case "clear": // 0
                    s = 0;
                    break;
            }
        }

        System.out.println(sb);
    }
}
