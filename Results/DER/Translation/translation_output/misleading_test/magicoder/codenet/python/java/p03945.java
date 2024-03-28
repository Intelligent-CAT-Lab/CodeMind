<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
101

```
# coding: utf-8
print((lambda x:x.count('WB')+x.count('BW'))(input()))
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countSwaps(input));
    }

    public static int countSwaps(String input) {
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'W' && input.charAt(i + 1) == 'B') {
                count++;
            } else if (input.charAt(i) == 'B' && input.charAt(i + 1) == 'W') {
                count++;
            }
        }
        return count;
    }
}
```

This Java code reads a string from the user, counts the number of times the characters 'W' and 'B' alternate in the string, and then prints the count. The `countSwaps` method iterates over the string and increments the count whenever it encounters a pair of 'W' and 'B' or 'B' and 'W'.<｜end▁of▁sentence｜>
