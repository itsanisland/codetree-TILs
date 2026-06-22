import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String t = st.nextToken();
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.length() < t.length()) continue;

            boolean isPass = true;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(j) != t.charAt(j)) {
                    isPass = false;
                    break;
                }
            }

            if (isPass) {
                list.add(s);
            }
        }

        Collections.sort(list);

        System.out.println(list.get(k - 1));
    }
}