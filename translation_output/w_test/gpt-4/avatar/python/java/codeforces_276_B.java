Here's the equivalent Java code with a main method to take input and provide output based on the sample test case provided.

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        char[] s = input.toCharArray();
        Map<Character, Integer> dt = new HashMap<>();
        for (char i : s) {
            dt.put(i, dt.getOrDefault(i, 0) + 1);
        }

        int cnt = 0;
        boolean x = true;
        for (int value : dt.values()) {
            if (value % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (value % 2 != 0) {
                x = false;
                break;
            }
        }

        if (x) {
            System.out.println("First");
        } else if (!x && s.length % 2 == 0) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }
}
```

When you input the provided test string into this Java program, it should output "Second", matching the expected output.
