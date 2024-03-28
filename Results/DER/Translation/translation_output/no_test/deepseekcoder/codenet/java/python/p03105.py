<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    A = int(sys.stdin.readline().strip())
    B = int(sys.stdin.readline().strip())
    C = int(sys.stdin.readline().strip())
    N = B // A
    if N > C:
        print(C)
    else:
        print(N)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates `N = B // A`, and then prints the smaller of `N` and `C`. The `//` operator in Python is the integer division operator, which divides the first number by the second and returns the largest whole number less than or equal to the result.
<|EOT|>
