<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 11 4

Expected output:
-26

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

### Response:
```python
def p03105():
    A, B, C = map(int, input().split())
    N = B // A
    if N > C:
        print(C)
    else:
        print(N)

p03105()
```

This Python code reads three integers from the input, calculates the integer division of B by A and assigns it to N. It then compares N with C and prints the smaller of the two.
<|EOT|>
