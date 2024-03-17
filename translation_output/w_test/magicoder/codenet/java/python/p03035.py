<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
30 100

Expected output:
100


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

@@ Response
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

In this Python code, we use the `sys.stdin.readline()` function to read the input from the console. The `map(int, sys.stdin.readline().split())` function is used to convert the input into integers. The `//` operator is used for integer division in Python. The `if __name__ == "__main__":` block is used to ensure that the `main()` function is called when the script is run directly, but not when it's imported as a module.<｜end▁of▁sentence｜>
