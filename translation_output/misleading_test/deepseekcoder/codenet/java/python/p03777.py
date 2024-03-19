<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
H H

Expected output:
H

```
import java.util.*;

public class p03777{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    if(a.equals(b)){
      System.out.println("H");
    }else{
      System.out.println("D");
    }
  }
}

```

### Response:
```python
import sys

def main():
    a = sys.stdin.readline().strip()
    b = sys.stdin.readline().strip()
    if a == b:
        print("H")
    else:
        print("D")

if __name__ == "__main__":
    main()
```

In this Python code, we use `sys.stdin.readline().strip()` to read the input from the standard input. The `strip()` function is used to remove any leading or trailing whitespace. If the two strings are equal, the program prints "H", otherwise it prints "D".
<|EOT|>
