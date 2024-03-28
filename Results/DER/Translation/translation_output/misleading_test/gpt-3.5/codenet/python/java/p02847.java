```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine().trim();

        int[] week = {0, 1, 2, 3, 4, 5, 6};
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int index = -1;
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(a)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(7 - week[index]);
        }
    }
}
```
