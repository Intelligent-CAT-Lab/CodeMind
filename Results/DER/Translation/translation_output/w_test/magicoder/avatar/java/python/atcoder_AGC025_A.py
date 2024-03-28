<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9

Expected output:
9


```
import java.util.*;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i) != '0') {
                int sum = 0;
                for (int j = 0; j < n.length(); j++) {
                    sum += n.charAt(j) - '0';
                }
                System.out.println(sum);
                return;
            }
        }

        if (n.charAt(0) == '1') {
            System.out.println(10);
            return;
        }

        System.out.println(n.charAt(0));
    }
}
```

@@ Response
```python
n = int(input())

for i in range(1, len(str(n))):
    if str(n)[i] != '0':
        sum = 0
        for j in range(len(str(n))):
            sum += int(str(n)[j])
        print(sum)
        break

if str(n)[0] == '1':
    print(10)
else:
    print(str(n)[0])
```

This Python code does the same thing as the Java code. It reads an integer from the input, then iterates over its digits. If it finds a non-zero digit, it calculates the sum of all digits and prints it. If it doesn't find a non-zero digit, it checks if the first digit is 1. If it is, it prints 10. Otherwise, it prints the first digit.<｜end▁of▁sentence｜>
