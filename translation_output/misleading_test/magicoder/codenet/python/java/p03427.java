<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
-13

```
n = input()
print(max(int(n[0])-1+9*(len(n)-1),sum([int(i) for i in n])))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int max = Integer.parseInt(String.valueOf(n.charAt(0))) - 1 + 9 * (n.length() - 1);
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        System.out.println(Math.max(max, sum));
    }
}
```

This Java code reads a number from the user, calculates the maximum value between the sum of the digits and the first digit subtracted by 1 plus 9 times the number of digits minus 1, and then prints the maximum value.<｜end▁of▁sentence｜>
