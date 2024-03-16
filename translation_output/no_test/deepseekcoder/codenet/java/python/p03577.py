<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
class p03577{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int length = line.length();
        System.out.println(line.substring(0,line.length()-8));
    }
}

```

### Response:
```python
import sys

def main():
    line = sys.stdin.readline().strip()
    print(line[:-8])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line from standard input, removes the last 8 characters, and prints the result. The `strip()` function is used to remove any trailing newline characters. The `[:-8]` slice is used to get all characters in the string except the last 8.
<|EOT|>
