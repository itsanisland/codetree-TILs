import java.util.*;

class Spy {
    String cName;
    int score;

    Spy() {
        this.cName = "";
        this.score = 0;
    }

    Spy(String cName, int score) {
        this.cName = cName;
        this.score = score;
    }

    void print() {
        System.out.println(cName + " " + score);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Spy> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String cName = sc.next();
            int score = sc.nextInt();
            list.add(new Spy(cName, score));
        }

        Collections.sort(list, (a, b) -> {
            return a.score - b.score;
        });

        list.get(0).print();
    }
}