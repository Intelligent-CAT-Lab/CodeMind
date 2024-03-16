Here's the Java translation for the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assuming the input line has two integers separated by a space
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        if (N % 2 == 0) {
            if (N / 2 >= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if (N / 2 + 1 >= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
```

To test the provided test case with this Java code:

Test input:
3 2

Expected output:
YES

You would run the Java program, and it should read the integers `3 2` and output `YES`.
