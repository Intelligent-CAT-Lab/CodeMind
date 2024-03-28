<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3 2

Expected output:
Yes


```
import java.util.*;

public class p03719 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String result = "No";
        if (a <= c && c <= b) result ="Yes";
        
        System.out.println(result);
      
    }
}

```

@@ Response
```python
# Python code

# Get input from user
a, b, c = map(int, input().split())

# Initialize result as "No"
result = "No"

# Check if c is between a and b
if a <= c <= b:
    result = "Yes"

# Print result
print(result)
```

This Python code does the same thing as the Java code. It reads three integers from the user, checks if the third integer is between the first and second integers, and prints "Yes" if it is, and "No" otherwise.<｜end▁of▁sentence｜>
