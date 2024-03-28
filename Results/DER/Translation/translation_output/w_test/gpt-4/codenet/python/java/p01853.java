Here is the equivalent code in Java:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        String[] points = new String[n];
        
        Arrays.fill(points, "0");
        
        for (int i = n / 2 + 1; i < n; i++) {
            points[i] = String.valueOf(m);
        }

        System.out.println(String.join(" ", points));
    }
}

```

To test the code with the input `3 100`, you would run the `Main` class, input `3 100` when prompted, and expect the output `0 0 100`. Please note that Java requires a main class to run the program, and the input has to be provided through a `Scanner` object or alternatively through command line arguments or other input mechanisms.
