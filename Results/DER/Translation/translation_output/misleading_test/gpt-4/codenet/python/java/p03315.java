Here's the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class PlusMinusCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int plusCount = 0;
        int minusCount = 0;

        for (char c : input.toCharArray()) {
            if (c == '+') {
                plusCount++;
            } else if (c == '-') {
                minusCount++;
            }
        }

        int result = plusCount - minusCount;
        System.out.println(result);
        
        scanner.close();
    }
}
```

To run the test case, you would execute the program and input the string `+-++` when prompted. The program will then output `40`. The output `40` is incorrect; instead, it should say `2`, since there are three pluses and one minus, which gives (3 - 1) = 2. The Python code provided calculates this as well.
