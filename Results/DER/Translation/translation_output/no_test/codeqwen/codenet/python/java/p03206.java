Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        scanner.close();

        String[] days = {"", "Christmas", "Christmas Eve", "Christmas Eve Eve", "Christmas Eve Eve Eve"};
        String result = days[D];

        System.out.println(result);
    }
}
```

In this Java code, we use a `Scanner` to read the input from the user. The input is an integer, so we use `nextInt()` to read it. We then close the `Scanner` to release the resources.

We define an array of strings where the index corresponds to the number and the value is the name of the day. We then use the input to index into this array and get the corresponding day.

Finally, we print out the result.
