<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 3

Expected output:
1


```
import java.util.*;

public class p03284{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),k=sc.nextInt();
        if(n%k == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}
```

@@ Response
```python
# Python code

# Get input from user
n, k = map(int, input().split())

# Check if n is divisible by k
if n % k == 0:
    print(0)
else:
    print(1)
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks if the first integer is divisible by the second, and prints 0 if it is and 1 if it isn't.<｜end▁of▁sentence｜>
