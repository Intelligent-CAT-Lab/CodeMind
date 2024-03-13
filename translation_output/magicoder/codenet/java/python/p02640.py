<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.lang.Integer; 

public class p02640 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x = sc.nextInt(); // é ­æ°
    double y = sc.nextInt(); // è¶³ã®æ°
    double crane = -(y/2) + 2*x;
    double turtle = x - crane;
    if(turtle < 0 || crane < 0 || turtle % 1 != 0 || crane % 1 != 0 ){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    x = int(sys.stdin.readline())
    y = int(sys.stdin.readline())
    crane = -(y/2) + 2*x
    turtle = x - crane
    if turtle < 0 or crane < 0 or turtle % 1 != 0 or crane % 1 != 0:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the crane and turtle positions, and then checks if the turtle and crane positions are valid. If they are not, it prints "No". If they are, it prints "Yes".<｜end▁of▁sentence｜>
