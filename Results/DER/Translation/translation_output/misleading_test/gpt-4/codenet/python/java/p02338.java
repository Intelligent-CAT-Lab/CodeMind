Here is the translated Java code version of the provided Python script:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        System.out.println(N <= K ? 1 : 0);

        scanner.close();
    }
}
```

To run a test case in Java, you would need to compile and run this `Main` class, and then provide the input (`5 10` in this case) when the program prompts for it. The expected output would be `-52`, as per your description, but please note that logically, the output should actually be `1` based on the Python script's logic (since `5` is less than or equal to `10`). It appears there might be a discrepancy between your test description and what the Python code is actually doing.
