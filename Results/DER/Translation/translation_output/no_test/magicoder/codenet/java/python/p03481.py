<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03481 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long X = sc.nextLong();
        Long Y = sc.nextLong();

        int i=0;
        while(X<=Y){
            i++;
            X*=2;
        }

        System.out.println(i);
    }
}
```

@@ Response
```python
import sys

def main():
    X, Y = map(int, sys.stdin.readline().split())

    i = 0
    while X <= Y:
        i += 1
        X *= 2

    print(i)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two long integers from the standard input, then it calculates how many times the first number can be doubled before it becomes greater than the second number. The result is then printed to the standard output.<｜end▁of▁sentence｜>
