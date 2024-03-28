<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 10 2

Expected output:
3


```
import java.util.Scanner;

public class p02606 {

    public p02606() {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int d = scanner.nextInt();

        int Ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0)
                Ans++;
        }

        System.out.println(Ans);
    }

    public static void main(String[] args) {
        new p02606();
    }
}

```

@@ Response
```python
# Python code

# Get input from user
L, R, d = map(int, input().split())

# Initialize Ans
Ans = 0

# Loop through the range
for i in range(L, R+1):
    # Check if i is divisible by d
    if i % d == 0:
        # Increment Ans
        Ans += 1

# Print Ans
print(Ans)
```

This Python code does the same thing as the Java code. It reads three integers from the user, then counts how many numbers in the range from L to R (inclusive) are divisible by d. The result is then printed to the console.<｜end▁of▁sentence｜>
