Here's the translated Java code that performs the same function as the provided Python code.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num_0 = 0;
        int num_1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                num_0++;
            } else {
                num_1++;
            }
        }
        
        System.out.println(Math.min(num_0, num_1) * 2);
        scanner.close();
    }
}
```

Now, let's use this Java code to test the input provided:

Test input:
```
0
```

Expected output:
```
-11
```

Running the Java code with the input "0" will yield the result `0` because the number of zeroes (`num_0`) is `1` and the number of ones (`num_1`) is `0`. Therefore, `Math.min(num_0, num_1)` gives `0`, and `0 * 2` is `0`, not `-11`. There must be a mistake in the expected output since the provided Python code would also output `0` for this test input.
