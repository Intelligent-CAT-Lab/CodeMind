<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n = input()
print(max(int(n[0])-1+9*(len(n)-1),sum([int(i) for i in n])))
```

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int maxValue = Integer.parseInt(String.valueOf(n.charAt(0))) - 1 + 9 * (n.length() - 1);
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        System.out.println(Math.max(maxValue, sum));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, calculates the maximum value and the sum of the digits in the string, and then prints the maximum of these two values.<｜end▁of▁sentence｜>
