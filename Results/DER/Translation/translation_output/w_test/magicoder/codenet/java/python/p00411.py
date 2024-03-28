<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
180 120 90

Expected output:
60.0


```
import java.util.*;

public class p00411{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double t = scan.nextInt();
        double r = scan.nextInt();
        System.out.println(r * t / a);
        scan.close();
    }
}

```

@@ Response
```python
# Python code

# Get input from user
a, t, r = map(float, input().split())

# Calculate and print the result
print(r * t / a)
```

In this Python code, we use the `input()` function to get the input from the user. The `split()` function is used to split the input into three separate values, which are then converted to floats using the `map()` function. The result is then calculated and printed.<｜end▁of▁sentence｜>
