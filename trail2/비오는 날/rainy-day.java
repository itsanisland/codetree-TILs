import java.util.*;

class Forecast {
    String date, dayOfWeek, status;

    Forecast() {
        this.date = "9999-99-99";
        this.dayOfWeek = "";
        this.status = "";
    }

    Forecast(String date, String dayOfWeek, String status) {
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
        Forecast ans = new Forecast();

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String dayOfWeek = sc.next();
            String status = sc.next();
            Forecast f = new Forecast(date, dayOfWeek, status);

            if (status.equals("Rain")) {
                if (f.date.compareTo(ans.date) < 0) {
                    ans = f;
                } 
            }
        }

        ans.print();
    }
}