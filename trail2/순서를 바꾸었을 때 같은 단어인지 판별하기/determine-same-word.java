import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr1 = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String s1 = new String(arr1);
        String s2 = new String(arr2);

        System.out.println(s1.equals(s2) ? "Yes" : "No");
    }
}