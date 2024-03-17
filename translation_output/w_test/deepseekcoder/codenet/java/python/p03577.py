<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CODE


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
def main():
    line = input()
    print(line[:-8])

if __name__ == "__main__":
    main()
```

In this Python code, we use the `input()` function to read the input string. We then use slicing to get the first part of the string up to the 8th last character (0-indexed, so `-8` means 8th from the end). The result is printed using the `print()` function.
<|EOT|>
