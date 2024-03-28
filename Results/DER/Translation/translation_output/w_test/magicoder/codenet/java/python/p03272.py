<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2

Expected output:
3


```
import java.util.*;

public class p03272 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        
        System.out.println(N-K+1);
    }
}

```

@@ Response
```python
# Python code

# Get input from user
N, K = map(int, input().split())

# Print the result
print(N-K+1)
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the result as N-K+1, and then prints the result.<｜end▁of▁sentence｜>
