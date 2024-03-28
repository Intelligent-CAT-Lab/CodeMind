<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02682{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    int sum = 0;
    if (d<=a){
      System.out.println(d);
      return;
    }
    sum = a;
    d -= a;
    if(d<=b){
      System.out.println(sum);
      return;
    }
    d-=b;
    sum -= d;
    System.out.println(sum);
  }
}

```

@@ Response
```python
import sys

def main():
    a, b, c, d = map(int, sys.stdin.readline().split())
    sum = 0
    if d <= a:
        print(d)
        return
    sum = a
    d -= a
    if d <= b:
        print(sum)
        return
    d -= b
    sum -= d
    print(sum)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, and then performs the same operations as the Java code.<｜end▁of▁sentence｜>
