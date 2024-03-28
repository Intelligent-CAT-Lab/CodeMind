Here is the translated Java code for the provided Python code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        if (n % 3 == 0) {
            System.out.println(n / 3 * 2);
        } else if (n < 3) {
            System.out.println(1);
        } else {
            System.out.println(n / 3 * 2 + 1);
        }

        scanner.close();
    }
}
```

To use the above Java code, you can create a Java class file and run it. The code will read a number from the system input (`stdin`), perform the same logic as the original Python code, and then print the result to the system output (`stdout`).
