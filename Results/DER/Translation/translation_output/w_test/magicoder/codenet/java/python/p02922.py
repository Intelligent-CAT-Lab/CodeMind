<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 10

Expected output:
3


```
import java.util.Scanner;
public class p02922 {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = (b-1)/(a-1);
    if((b-1)%(a-1)==0) {
    	System.out.println(ans);
    }else {
    	System.out.println(ans+1);
    }
    }
}
```

@@ Response
```python
# Python code

# Read input from user
a, b = map(int, input().split())

# Calculate the answer
ans = (b-1)//(a-1)

# Check if there is a remainder
if (b-1)%(a-1) == 0:
    print(ans)
else:
    print(ans+1)
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the answer, and then prints it. The difference is that Python uses `//` for integer division and `%` for modulus.<｜end▁of▁sentence｜>
