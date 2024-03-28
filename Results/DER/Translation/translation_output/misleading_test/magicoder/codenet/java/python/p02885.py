<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12 4

Expected output:
33

```
import java.util.*;

public class p02885 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        if(a > 2 * b)   System.out.println(a - 2 * b);
        else System.out.println(0);
    }
}
```

@@ Response
```python
# Python code

# Read input
a, b = map(int, input().split())

# Check condition and print output
if a > 2 * b:
    print(a - 2 * b)
else:
    print(0)
```

This Python code does the same thing as the Java code. It reads two integers from the input, checks if the first integer is greater than twice the second integer, and prints the difference between the first and twice the second integer if the condition is true, otherwise it prints 0.<｜end▁of▁sentence｜>
