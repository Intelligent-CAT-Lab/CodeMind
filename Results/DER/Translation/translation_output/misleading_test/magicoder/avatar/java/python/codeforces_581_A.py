<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
45 99

Expected output:
-51 -57

```
import java.util.*;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int count = 0;
        while (true) {
            if (a > 0 && b > 0) {
                count++;
                a--;
                b--;
            } else break;
        }
        int ans = a / 2 + b / 2;
        System.out.println(count + " " + ans);
    }
}
```

@@ Response
```python
# Python code

# Read input
a, b = map(int, input().split())

# Initialize count
count = 0

# Loop until a and b are both 0
while a > 0 and b > 0:
    count += 1
    a -= 1
    b -= 1

# Calculate the answer
ans = a // 2 + b // 2

# Print the result
print(count, ans)
```

This Python code does the same thing as the Java code. It reads two integers from the input, counts the number of times it can subtract 1 from both numbers until one of them becomes 0, and then calculates the answer by dividing the remaining numbers by 2. The result is then printed to the console.<｜end▁of▁sentence｜>
