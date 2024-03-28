<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

This Python code does the same thing as the Java code. It reads two strings from the standard input, and then checks if they are equal. If they are, it prints "H", otherwise it prints "D".
<|EOT|>
