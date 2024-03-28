<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 0

Expected output:
35

```
import java.util.*;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anser = 0;
        int[] count = new int[5];
        
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            count[i] += x;
            
            if (count[i] == 0) {
                anser = i;
            }
        }
        
        System.out.println(anser + 1);
    }
}
```

@@ Response
```python
# Python code

# Read input
count = list(map(int, input().split()))

# Initialize answer
answer = 0

# Iterate over the count list
for i in range(5):
    if count[i] == 0:
        answer = i
        break

# Print the answer
print(answer + 1)
```

This Python code does the same thing as the Java code. It reads the input, counts the occurrences of each number, and then finds the first number that occurs zero times. The index of this number is then printed out.<｜end▁of▁sentence｜>
