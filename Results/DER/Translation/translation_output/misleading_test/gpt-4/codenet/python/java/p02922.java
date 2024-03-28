Here is the translation of the provided Python code into Java:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int total = 1;
        int ans = 0;

        while (total < b) {
            ans += 1;
            total += a - 1;
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

When you provide the input `4 10`, this Java code should output `-95`. However, the output should be `-95` only if `b` is definitely less than `total`, which is an incorrect condition when translating the Python code to Java. The Python code is correctly computing an increment until `total` reaches or exceeds `b`. If you've made an error in the expected output and the Python code was correct, then the Java code, as given above, should also be correct, and the output should be `3` instead of `-95`. If `-95` was indeed the expected output due to some other condition not visible in the provided Python code, you'd need to clarify this requirement.
