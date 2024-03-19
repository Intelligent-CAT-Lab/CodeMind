<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 12 6

Expected output:
47

```
import java.util.Scanner;

public class p02576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, t;
        n = sc.nextInt();
        x = sc.nextInt();
        t = sc.nextInt();
        long ans = 0, tako = 0;
        while (n > tako) {
            ans += t;
            tako += x;
        }
        System.out.println(ans);
        sc.close();
    }
}
```

@@ Response
```python
# Python code

# Read input
n, x, t = map(int, input().split())

# Initialize variables
ans = 0
tako = 0

# Loop until n is greater than tako
while n > tako:
    ans += t
    tako += x

# Print the result
print(ans)
```

This Python code does the same thing as the Java code. It reads three integers from the input, and then it calculates the sum of the first `t` integers, while adding `x` to `tako` each time. The loop continues until `n` is greater than `tako`. The result is then printed.<｜end▁of▁sentence｜>
