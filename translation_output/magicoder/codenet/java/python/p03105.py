<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    A = int(sys.stdin.readline())
    B = int(sys.stdin.readline())
    C = int(sys.stdin.readline())
    N = B // A
    if N > C:
        print(C)
    else:
        print(N)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the integer division of B by A, and then checks if N is greater than C. If it is, it prints C, otherwise it prints N.<｜end▁of▁sentence｜>
