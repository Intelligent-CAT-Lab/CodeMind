<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong();
        if (r < 1200) {
            System.out.println("ABC");
        } else if (r < 2800){
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}

```

### Response:
```python
import sys

def main():
    r = int(sys.stdin.readline().rstrip())
    if r < 1200:
        print("ABC")
    elif r < 2800:
        print("ARC")
    else:
        print("AGC")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a long integer from the standard input, and then prints "ABC" if the number is less than 1200, "ARC" if it's less than 2800, and "AGC" otherwise.
<|EOT|>
