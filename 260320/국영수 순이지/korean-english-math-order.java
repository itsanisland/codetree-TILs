import java.io.*;
import java.util.*;

public class Main {

    static class Person implements Comparable<Person> {
        String name;
        int k, e, m;

        Person(String name, int k, int e, int m) {
            this.name = name;
            this.k = k;
            this.e = e;
            this.m = m;
        }

        public String toString() {
            return name + " " + k + " " + e + " " + m + "\n";
        }

        public int compareTo(Person o) {
			if (this.k != o.k) return o.k - this.k;
			if (this.e != o.e) return o.e - this.e;
			return o.m - this.m;
		}
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
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
        
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}