Below is the Java translation of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '0') {
                count0++;
            } else if (input.charAt(i) == '1') {
                count1++;
            }
        }

        System.out.println(2 * Math.min(count0, count1));
    }
}
```

To run the test case provided with the input `0011`, you can simply run this Java code and provide the input (without quotes) when prompted. It should produce the expected output, which is `4`.
