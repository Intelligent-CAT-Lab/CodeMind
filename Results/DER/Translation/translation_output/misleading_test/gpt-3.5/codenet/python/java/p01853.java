```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String[] points = new String[n];
        for (int i = 0; i < n; i++) {
            points[i] = "0";
        }

        for (int i = n / 2 + 1; i < n; i++) {
            points[i] = Integer.toString(m);
        }

        System.out.println(String.join(" ", points));
    }
}
```
