<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
 
public class p02645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        System.out.println(s.substring(0,3));
   }
}

```

### Response:
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    print(s[:3])

if __name__ == "__main__":
    main()
```

This Python code reads a line from standard input, strips any trailing newline characters, and prints the first three characters of the string.
<|EOT|>
