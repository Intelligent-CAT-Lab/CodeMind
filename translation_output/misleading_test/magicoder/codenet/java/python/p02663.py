<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 0 15 0 30

Expected output:
191

```
import java.util.Scanner;

public class p02663 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = nextInt(scanner);
        int m1 = nextInt(scanner);
        int h2 = nextInt(scanner);
        int m2 = nextInt(scanner);
        int k = nextInt(scanner);
        int h = h2 - h1;
        int m = m2 - m1;
        int day = (h * 60) + m;
        System.out.println(day - k);

    }

    public static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }
}

```

@@ Response
```python
# Python code

# Read input
h1, m1, h2, m2, k = map(int, input().split())

# Calculate the time difference in minutes
h = h2 - h1
m = m2 - m1
day = (h * 60) + m

# Print the result
print(day - k)
```

This Python code does the same thing as the Java code. It reads the input, calculates the time difference in minutes, and then subtracts the given constant `k` from the total time difference. The `map(int, input().split())` line reads the input and splits it into separate integers.<｜end▁of▁sentence｜>
