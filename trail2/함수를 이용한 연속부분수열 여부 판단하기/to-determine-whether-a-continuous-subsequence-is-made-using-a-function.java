import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        
        System.out.println(check(a, b) );
    }

    private static String check(int[] longArr, int[] shortArr) {
        for (int i = 0; i <= longArr.length - shortArr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < shortArr.length; j++) {
                if (longArr[i + j] != shortArr[j]) {
                    break;
                }
                cnt++;
            }

            if (cnt == shortArr.length) {
                return "Yes";
            }
        }

        return "No";
    }
}