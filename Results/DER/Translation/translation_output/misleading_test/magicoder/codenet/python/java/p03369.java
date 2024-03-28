<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxo

Expected output:
863

```
s = input()
print(700+100*s.count("o"))
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = countChar(s, 'o');
        System.out.println(700 + 100 * count);
    }

    public static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
```

In this Java code, we use a `Scanner` to read the input string. We then call the `countChar` method to count the number of 'o' characters in the string. The result is then printed to the console.

The `countChar` method iterates over each character in the string and increments a counter if the character is 'o'. This counter is then returned by the method.<｜end▁of▁sentence｜>
