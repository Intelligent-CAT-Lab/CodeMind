<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p00411{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double t = scan.nextInt();
        double r = scan.nextInt();
        System.out.println(r * t / a);
        scan.close();
    }
}

```

### Response:
```python
import sys

def main():
    a = int(sys.stdin.readline().strip())
    t = int(sys.stdin.readline().strip())
    r = int(sys.stdin.readline().strip())
    print(r * t / a)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the result as `r * t / a`, and prints the result.
<|EOT|>
