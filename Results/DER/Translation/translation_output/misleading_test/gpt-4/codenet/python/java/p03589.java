Here is the equivalent Java code for the Python script you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int h = 1; h <= 3500; h++) {
            for(int n = h; n <= 3500; n++) {
                if (4 * n * h - N * h - N * n > 0) {
                    if ((N * h * n) % (4 * n * h - N * h - N * n) == 0) {
                        int w = (N * h * n) / (4 * n * h - N * h - N * n);
                        System.out.println(h + " " + n + " " + w);
                        scanner.close();
                        return;
                    }
                }
            }
        }
    }
}
```

You can use this Java code in place of the Python script to get the same results.
