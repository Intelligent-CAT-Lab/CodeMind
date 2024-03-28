<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
1


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
        return input.split("WB").length - 1 + input.split("BW").length - 1;
    }
}
```

In this Java code, we first read the input string from the user. Then we call the `countSwaps` method, which splits the input string by "WB" and "BW" and counts the number of resulting substrings minus 1. The result is the number of swaps needed to convert the input string to alternating 'B' and 'W' characters.

You can test this code with the following test case:

Test input:
BBBWW

Expected output:
1<｜end▁of▁sentence｜>
