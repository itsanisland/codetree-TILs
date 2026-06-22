import java.util.*;

class Weather {
    String date, dayOfWeek, status;

    Weather() {
        this.date = "";
        this.dayOfWeek = "";
        this.status = "";
    }

    Weather(String date, String dayOfWeek, String status) {
        this.date = date;
        this.dayOfWeek = dayOfWeek;
        this.status = status;
    }

    void print() {
        System.out.println(date + " " + dayOfWeek + " " + status);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Weather> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String dayOfWeek = sc.next();
            String status = sc.next();
            if (status.equals("Rain")) {
                list.add(new Weather(date, dayOfWeek, status));
            }
        }

        Collections.sort(list, (a, b) -> a.date.compareTo(b.date));

        list.get(0).print();
    }
}