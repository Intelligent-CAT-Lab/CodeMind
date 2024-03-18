Below is the translation of the provided Python code into Java. You can run this Java code to get the expected output based on the provided test input.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    cnt1 += 1;
                } else {
                    cnt2 += 1;
                }
            } else {
                if (s.charAt(i) == '0') {
                    cnt2 += 1;
                } else {
                    cnt1 += 1;
                }
            }
        }
        System.out.println(Math.min(cnt1, cnt2));
        scanner.close();
    }
}
```

This Java code reads a string from the input, counts the occurrences based on the provided conditions, and finally prints the minimum count, just like the provided Python code. Ensure that you have Java set up on your system to compile and run this code.
