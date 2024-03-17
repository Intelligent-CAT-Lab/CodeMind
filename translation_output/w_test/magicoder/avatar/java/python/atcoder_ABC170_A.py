<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 0

Expected output:
5


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
input_values = list(map(int, input().split()))

# Initialize variables
answer = 0
count = [0]*5

# Iterate over the input values
for i in range(5):
    x = input_values[i]
    count[i] += x
    
    # Check if the count is 0
    if count[i] == 0:
        answer = i

# Print the answer
print(answer + 1)
```

This Python code does the same thing as the Java code. It reads the input, initializes the variables, and then iterates over the input values. If the count of a value is 0, it sets the answer to the index of that value. Finally, it prints the answer plus 1.<｜end▁of▁sentence｜>
