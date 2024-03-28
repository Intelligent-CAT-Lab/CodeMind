<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p03035{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(a<=5){
      System.out.println(0);
    }
    else if(a<=12){
      System.out.println((int)(b/2));
    }
    else{
      System.out.println(b);
    }
  }
}
```

### Response:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    
    if a <= 5:
        print(0)
    elif a <= 12:
        print(b // 2)
    else:
        print(b)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, and then prints a different number based on the values of the two integers. If the first integer is less than or equal to 5, it prints 0. If the first integer is less than or equal to 12, it prints half of the second integer (after integer division). Otherwise, it prints the second integer as is.
<|EOT|>
