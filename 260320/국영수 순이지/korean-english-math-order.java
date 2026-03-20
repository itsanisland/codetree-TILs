import java.io.*;
import java.util.*;

class Person {
    String name;
    int k, e, m;

    Person(String name, int k, int e, int m) {
        this.name = name;
        this.k = k;
        this.e = e;
        this.m = m;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Person[] arr = new Person[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int k = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            arr[i] = new Person(name, k, e, m);
        }
        
        Arrays.sort(arr, (a , b) -> {
            if (a.k != b.k) return b.k - a.k;
            else if (a.e != b.e) return b.e - a.e;
            else return b.m - a.m;
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].name + " " + arr[i].k + " " + arr[i].e + " " + arr[i].m);
        }
    }
}