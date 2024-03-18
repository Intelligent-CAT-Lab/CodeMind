Here's the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class CountTwos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int count = 0;

        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == '2') {
                count++;
            }
        }

        System.out.println(-1 * count);
        scanner.close();
    }
}
```

To run the expected test case with the input "1222", you would compile and execute this Java program, enter "1222" when prompted, and it should output -54 (since there are three '2's and the output is the negative count, -3).
