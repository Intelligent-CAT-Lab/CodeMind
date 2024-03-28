<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3 2

Expected output:
YES


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

# Importing the required module
import sys

# Reading input from the user
r, g, b = map(int, sys.stdin.readline().split())

# Calculating the sum
sum = r*100 + g*10 + b

# Checking if the sum is divisible by 4
if sum % 4 == 0:
    print("YES")
else:
    print("NO")
```

In the above Python code, we are using the `sys.stdin.readline()` function to read the input from the user. The `map()` function is used to convert the input into integers. The sum is calculated by multiplying the numbers by their respective multiples of 10 and then adding them together. The `%` operator is used to check if the sum is divisible by 4. If it is, "YES" is printed; otherwise, "NO" is printed.<｜end▁of▁sentence｜>
