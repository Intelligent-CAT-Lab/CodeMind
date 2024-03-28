<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class p02999{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  // input Integer
    int b = sc.nextInt();  // input Integer
//    String a = sc.next();  // input String
    if (a<b){
      System.out.println(0);
    } else {
      System.out.println(10);
    }
  }
}
```

@@ Response
```python
import sys

def main():
    a = int(sys.stdin.readline())  # input Integer
    b = int(sys.stdin.readline())  # input Integer
    # input String
    # a = sys.stdin.readline()
    if a < b:
        print(0)
    else:
        print(10)

if __name__ == "__main__":
    main()
```

In Python, we don't need to import the `Scanner` class from `java.util`, instead we use `sys.stdin.readline()` to read input from the console. Also, Python doesn't need to specify the type of the input variable, it automatically determines the type based on the input.<｜end▁of▁sentence｜>
