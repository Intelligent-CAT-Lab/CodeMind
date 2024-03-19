<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3 2

Expected output:
YS

```
import java.util.*;
public class p03693 {
 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt()*100;
        int g=scan.nextInt()*10;
        int b=scan.nextInt();
 
        int sum=r+g+b;
        System.out.println(sum%4==0?"YES":"NO");
 
    }
}
```

@@ Response
```python
# Python code

# Get input from user
r, g, b = map(int, input().split())

# Calculate the sum
sum = (r*100) + (g*10) + b

# Check if the sum is divisible by 4
if sum % 4 == 0:
    print("YES")
else:
    print("NO")
```

This Python code does the same thing as the Java code. It takes three integers as input, calculates the sum of the three integers multiplied by 100, 10, and 1 respectively, and then checks if the sum is divisible by 4. If it is, it prints "YES"; otherwise, it prints "NO".<｜end▁of▁sentence｜>
