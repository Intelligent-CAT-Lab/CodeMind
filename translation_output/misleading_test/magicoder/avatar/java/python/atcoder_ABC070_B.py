<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 50 50 100

Expected output:
-21

```
import java.util.*;

public class atcoder_ABC070_B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[] array = new int[101];
        
        for (int i = a; i < b; i++) {
            array[i]++;
        }
        
        for (int i = c; i < d; i++) {
            array[i]++;
        }
        
        int ans = 0;
        for (int i = 0; i < 101; i++) {
            if (array[i] == 2) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
```

@@ Response
```python
# Python code

# Read input
a, b, c, d = map(int, input().split())

# Initialize array
array = [0] * 101

# Increment array values
for i in range(a, b):
    array[i] += 1

for i in range(c, d):
    array[i] += 1

# Count overlapping values
ans = sum(1 for i in range(101) if array[i] == 2)

# Print result
print(ans)
```

This Python code does the same thing as the Java code. It reads four integers from the input, initializes an array of 101 zeros, increments the array values for the given ranges, and then counts the number of array values that are 2, which represents the number of overlapping ranges. The result is then printed.<｜end▁of▁sentence｜>
