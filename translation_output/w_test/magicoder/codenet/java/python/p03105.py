<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 11 4

Expected output:
4


```
import java.util.*;

public class p03105 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int A= entrada.nextInt();
        int B= entrada.nextInt();
        int C= entrada.nextInt();
        int N=(int)B/A;
        if (N>C){
            System.out.println(C);
        }
        else{
            System.out.println(N);
        }
    }
    
}

```

@@ Response
```python
# Python code

# Read input from user
A, B, C = map(int, input().split())

# Calculate N
N = B // A

# Check if N is greater than C
if N > C:
    print(C)
else:
    print(N)
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates N as B divided by A, and then checks if N is greater than C. If it is, it prints C, otherwise it prints N.<｜end▁of▁sentence｜>
